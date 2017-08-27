package com.ming.springcloud;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class DalstonEurekaConsumerFeignHystrixApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DalstonEurekaConsumerFeignHystrixApp.class).web(true).run(args);
	}

}
