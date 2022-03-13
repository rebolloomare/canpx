package mx.gob.oadprs.antecentepenal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Constancia Antecedentes API", version = "1.0",
	description = "Constancia de Antecedentes Penales"))
public class ConstanciaAntecedentesPenalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstanciaAntecedentesPenalesApplication.class, args);
	}

}
