package fr.zyma.simplon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("fr.simplon.zyma.model")
@EnableJpaRepositories("fr.simplon.repository")
public class RbnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbnbApplication.class, args);
	}
}
