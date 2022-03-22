package mx.gob.oadprs.antecentepenal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API - Constancia Antecedentes Penales", version = "1.0",
	description = "API - Constancia de Antecedentes Penales"))
public class ConstanciaAntecedentesPenalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstanciaAntecedentesPenalesApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer configure() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").
				allowedOrigins("http://localhost:4200/").
				allowedOrigins("http://localhost/").
				allowedOrigins("http://dev.antecedentespenales.oadprs.gob.mx/").
				allowedOrigins("http://uat.antecedentespenales.oadprs.gob.mx/").
				allowedOrigins("http://antecedentespenales.oadprs.gob.mx/").
				allowedMethods("GET", "POST","PUT", "DELETE");
			}
		};
	}

}
