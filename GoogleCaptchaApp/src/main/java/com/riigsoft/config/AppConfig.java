package com.riigsoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author Abdallah Mahmoud
 * */
@Configuration
public class AppConfig {

	@Bean
	public RestTemplate createRt() {
		return new RestTemplate();
	}
}
