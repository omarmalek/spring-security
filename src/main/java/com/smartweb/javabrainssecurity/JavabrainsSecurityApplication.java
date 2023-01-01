package com.smartweb.javabrainssecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.smartweb.javabrainssecurity.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class JavabrainsSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavabrainsSecurityApplication.class, args);
	}

}
