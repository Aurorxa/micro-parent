package com.github.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 许大仙
 * @version 1.0
 * @since 2022-07-13 10:17:33
 */
@SpringBootConfiguration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getAdminDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("admin")
                .apiInfo(getAdminApiInfo())
                .select()
                .build();
    }
    public ApiInfo getAdminApiInfo(){
        return  new ApiInfoBuilder()
                .title("springCloud微服务实战")
                .description("Gradle 构建微服务实战")
                .version("1.0")
                .build();
    }
}
