package example.spring.rest.data.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.awt.*;

//
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;
//

@SpringBootApplication(scanBasePackages = "movie_api")
@EnableJpaRepositories(basePackages = "movie_api")
@EntityScan(basePackages = "movie_api")
public class SpringRestDataJpaProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataJpaProjectApplication.class, args);
	}



//
	@Configuration
	public class WebConfig implements WebMvcConfigurer {

		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
					.allowedOrigins("http://localhost:3000") // React development server URL
					.allowedMethods("GET", "POST", "PUT", "DELETE")
					.allowedHeaders("*");


		}
	}

}
