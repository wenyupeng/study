package com.wen.config;

import io.swagger.models.Path;
import io.swagger.models.Swagger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wen on 2018/12/19.
 */
@Configuration
@EnableSwagger2
@Import({
        Swagger2Configuration.class
})
public class SwaggerAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public SwaggerProperties swaggerProperties() {
        return new SwaggerProperties();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "swagger.enabled", matchIfMissing = true)
    public Docket createRestApi(SwaggerProperties swaggerProperties) {
        /**
         * Docket：swagger配置的primary interface 首要接口
         *
         */
        return new Docket(DocumentationType.SWAGGER_2).
                //apiInfo 设置配置的初始化内容 Sets the api's meta information as included in the json ResourceListing response.
                apiInfo(
                        //Builds the api information
                        new ApiInfoBuilder()
                        .title(swaggerProperties.getTitle())
                        .description(swaggerProperties.getDescription())
                        .termsOfServiceUrl(swaggerProperties.getTermsOfServiceUrl())
                        .contact(swaggerProperties.getContact())
                        .version(swaggerProperties.getVersion())
                        .build())
                //Initiates a builder for api selection.api selection builder. To complete building the api selector, the build method of the api selector
                // needs to be called, this will automatically fall back to building the docket when the build method is called.
                .select()
                //Predicate that matches RequestHandler with given base package name for the class of the handler method.
                // This predicate includes all request handlers matching the provided basePackage
                .apis(RequestHandlerSelectors.basePackage(swaggerProperties.getBasePackage()))
                //Any path satisfies this condition
                .paths(PathSelectors.any())
                .build();
    }
}
