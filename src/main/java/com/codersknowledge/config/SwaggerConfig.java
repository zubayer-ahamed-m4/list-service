/**
 * 
 */
package com.codersknowledge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Zubayer Ahamed
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.codersknowledge"))
				.paths(PathSelectors.regex("/rest.*"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		return new ApiInfo(
			"List micro-service api",
			"Swagger rest service of list micro-service",
			"1.0.0",
			"Terms of Service",
			new Contact("CodersKnowledge", "https://www.youtube.com/channel/UC4vVj7lKO7H4FohB3lv9dzA?view_as=subscriber", "codersknowledge@gmail.com"),
			"Apache License Version 2.0",
			"https://www.apache.org/license.html"
		);
	}
}
