package br.com.alfaiate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class AlfaiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlfaiteApplication.class, args);
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
	
}
