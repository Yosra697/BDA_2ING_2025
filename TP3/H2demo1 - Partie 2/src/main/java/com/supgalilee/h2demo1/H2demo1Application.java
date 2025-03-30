package com.supgalilee.h2demo1;

import com.supgalilee.h2demo1.entities.Adherent;
import com.supgalilee.h2demo1.repository.AdherentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(H2demo1Application.class, args);
	}

	@Bean
	CommandLineRunner runner(AdherentRepository repository){
		return args -> {
			repository.save(new Adherent(null, "A", "Paris", 23));
			repository.save(new Adherent(null, "A", "Paris", 23));
			repository.save(new Adherent(null, "A", "Paris", 23));
			repository.save(new Adherent(null, "A", "Paris", 23));

		} ;
	}
}
