package start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * AUTO-GENERATED: houlu @ 2019/7/28 下午1:58
 *
 * @author houlu
 * @version 1.0.0
 * @since 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("start.controller"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("hello gradle api")
        .description("open recommendation api server")
        .termsOfServiceUrl("http://localhost:8080/")
        .version("1.0")
        .build();
  }

}