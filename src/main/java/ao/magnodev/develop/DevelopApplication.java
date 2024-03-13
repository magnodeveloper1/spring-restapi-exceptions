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

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
		
			Pessoa p1 = new Pessoa("Cristiano", 1.2f, 23);
			Pessoa p2 = new Pessoa("Moises", 1.3f, 30);
			Pessoa p3 = new Pessoa("Jeremis", 1.6f, 21);
			Pessoa p4 = new Pessoa("Martins", 2.1f, 17);
			Pessoa p5 = new Pessoa("Mauro", 1f, 33);
	
			repository.save(p1);
			repository.save(p2);
			repository.save(p3);
			repository.save(p4);
			repository.save(p5);
	
			System.out.println("Dados iniciais inseridos");
		};
	}

}
