package com.ming.springcloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("dalston-eureka-client")
public interface DcClient {

	@GetMapping("/dc")
	String consumer();
}
