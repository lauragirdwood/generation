package org.generation.brazil.artemis.swagger;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

public class SwaggerConfiguration {

    private ApiInfo info() {
        return new ApiInfoBuilder().title("Projeto Artemis")
                .description("Um projeto para treinar consumo de APIs e Spring Web")
                .contact(new Contact("Laura Girdwood","www.laura.com.br","contato@laura.com.br"))
                .license("MIT License")
                .licenseUrl("https://opensource.org/licenses/MIT")
                .version("0.0.1")
                .build();
    }

}
