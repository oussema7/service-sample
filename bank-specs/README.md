# Bank Specs

This module provides a generator to construct and configure the API client modules for external communications typically the bank Apis from OpenApi specs. 

## common-client

This project is based on the idea of generating the client classes from an **OpenAPI** specification file.
Because each client has common requirements or functionality, the module `common-client` contains a standard an `ApiClient` class and its dependencies. 
To generate the code, the module uses the `swagger-codegen-maven-plugin` and the common client module defines a custom generator that configures the generated code to use the classes defined in the
`common-client` module, also indicates not to generate those classes.
 
### Implementation

The module provides a resttemplate ApiClient Implementations: 
 - resttemplate: `com.microsphere.bank.common.client.api.client.resttemplate.ApiClient` a client implementation that use
 the spring `RestTemplate` class to perform the http calls. The code of this class is based on the generated class using 
 the `swagger-codegen-maven-plugin` configured with `resttemplate` as library.