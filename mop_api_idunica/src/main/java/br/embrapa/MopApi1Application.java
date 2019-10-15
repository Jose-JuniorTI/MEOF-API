package br.embrapa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.embrapa.config.property.MopApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(MopApiProperty.class)
public class MopApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(MopApi1Application.class, args);
	}
}
