package com.ming.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringCloudApplication
public class DalstonHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DalstonHystrixDashboardApplication.class, args);
	}

}
