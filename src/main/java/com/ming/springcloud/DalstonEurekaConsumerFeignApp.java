package com.ming.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class DalstonEurekaConsumerFeignApp {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	public static void main(String[] args) {

		new SpringApplicationBuilder(DalstonEurekaConsumerFeignApp.class).web(true).run(args);
	}

}
