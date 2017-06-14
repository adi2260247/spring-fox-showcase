package org.self.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
    private ApiInfo metaData() {
        final String title = "iOS Navigation Service DGL-FDN-V-IosNavigation";
		final String description = "iOS Navigation Service will return the navigation "
				+ "elements that will be used to generate and display the navigation menu "
				+ "on iOS app. It will tie in customer profile elements and provide only "
				+ "navigation items that the customer is eligiblbe to see.";
		final String version = "1.0";
		
		return new ApiInfoBuilder()
            .title(title)
            .description(description)
            .version(version)
            .build();
    }
    
    @Bean
    public Docket api() {
    	return new Docket(DocumentationType.SWAGGER_2)
    			.select()
    			.apis(RequestHandlerSelectors.basePackage("org.self.learn.controller"))
    			.paths(PathSelectors.regex("/navigation/menu"))
    			.build()
    			.apiInfo(metaData());
    }
}
