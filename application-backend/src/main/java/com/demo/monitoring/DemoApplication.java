package com.demo.monitoring;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {
	@Bean
	MeterRegistryCustomizer<MeterRegistry> configurer(
		@Value("${spring.application.name}") String applicationName) {
		return registry -> registry.config().commonTags("application", applicationName);
	}

	public boolean isReady() {
		return true;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}