package com.microsphere.bank.common.client.generator;

import com.microsphere.bank.common.client.api.client.resttemplate.ApiClient;
import io.swagger.codegen.v3.generators.java.JavaClientCodegen;

/**
 * Defines a new Swagger CodeGen class to customize the code generated for the api client.
 * This custom generator allows to configure the package of the ApiClient classes to be the same as this project,
 * also this class configures the generator to not generate the api client classes provided in this project.
 *
 * @author cesarl
 */
public class CustomClientGenerator extends JavaClientCodegen {

    @Override
    public void processOpts() {
        super.processOpts();
        this.supportingFiles.removeIf(s -> "ApiClient.java".equals(s.destinationFilename));
        this.supportingFiles.removeIf(s -> s.templateFile.startsWith("auth"));
        this.additionalProperties().put("invokerPackage", getApiClientPackage());
        this.removeClassesByLibrary();
        // Example code to generate a class with a mustache template
        // String invokerFolder = (this.sourceFolder + '/' + this.invokerPackage).replace(".", "/");
        // this.additionalProperties.put("commonApiPackage", ApiClientConfigurer.class.getPackage().getName());
        // this.supportingFiles.add(new SupportingFile("ApiClientCustomized.mustache", invokerFolder, "ApiClient.java"));
    }

    @Override
    public String getName() {
        return "custom-java";
    }

    private String getApiClientPackage() {
        switch (getLibrary()) {
            case "resttemplate":
                return ApiClient.class.getPackage().getName();
            case "okhttp-gson":
//                return com.microsphere.bank.common.client.api.client.okhttp.ApiClient.class.getPackage().getName();
            default:
                throw new IllegalStateException("There is no ApiClient class configured for the library " + library);
        }
    }

    private void removeClassesByLibrary() {
        switch (getLibrary()) {
            case "resttemplate":
                this.supportingFiles.removeIf(s -> "CustomInstantDeserializer.java".equals(s.destinationFilename));
                this.supportingFiles.removeIf(s -> "RFC3339DateFormat.java".equals(s.destinationFilename));
                break;
            case "okhttp-gson":
                this.supportingFiles.removeIf(s -> "ApiCallback.java".equals(s.destinationFilename));
                this.supportingFiles.removeIf(s -> "ApiException.java".equals(s.destinationFilename));
                this.supportingFiles.removeIf(s -> "ApiResponse.java".equals(s.destinationFilename));
                this.supportingFiles.removeIf(s -> "JSON.java".equals(s.destinationFilename));
                this.supportingFiles.removeIf(s -> "Pair.java".equals(s.destinationFilename));
                this.supportingFiles.removeIf(s -> "ProgressRequest.java".equals(s.destinationFilename));
                this.supportingFiles.removeIf(s -> "StringUtil.java".equals(s.destinationFilename));
                break;
        }
    }
}
