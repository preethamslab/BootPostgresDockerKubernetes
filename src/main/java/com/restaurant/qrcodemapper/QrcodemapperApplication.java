package com.restaurant.qrcodemapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.restaurant.qrcodemapper.model.AuditorAwareImpl;

@SpringBootApplication
/* @EnableJpaAuditing(auditorAwareRef="auditorAware") */
public class QrcodemapperApplication {
	/*
	 * @Bean public AuditorAware<String> auditorAware() { return new
	 * AuditorAwareImpl(); }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(QrcodemapperApplication.class, args);
	}

}
