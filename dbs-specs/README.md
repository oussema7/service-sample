# dbs-specs

### This project contains OpenApi specification files for Digital Banking Services.

Based on `openapi-generator-maven-plugin`in combination with `Backbase boat-maven-plugin` and enables to generate RestController and ApiClient 
from OpenApi files for service-to-service communication within the microservices platform.

Each ApiClient has its own AutoConfiguration file where the `serviceId` and `scheme` are configurable.
ApiClient beans creation requires injection of a special bean of a `RestTemplate` named `interServiceRestTemplate`, defined in buildingblocks dependencies and preconfigured from inter-service communication with service scope authentication present.

Each submodule defines its :
- specs version
- spec file name
- generated-source base package

InputSpec configuration parameter of the generator plugin points to the specs folder within the project.