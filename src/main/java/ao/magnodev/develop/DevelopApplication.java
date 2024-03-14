package ao.magnodev.develop;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DevelopApplication {

	@Autowired
	PessoaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DevelopApplication.class, args);
	}

}
