package com.ming.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard	
@SpringCloudApplication
public class DalstonHystrixDashboardApp {

	public static void main(String[] args) {
		SpringApplication.run(DalstonHystrixDashboardApp.class, args);
	}

}
