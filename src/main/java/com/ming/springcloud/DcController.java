package com.ming.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DcController {

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/consumer")
	public String dc() {
		return restTemplate.getForObject("http://dalston-eureka-client/dc", String.class);
	}

	@Service
	class ConsumerService {
		@Autowired
		RestTemplate restTemplate;

		@HystrixCommand(fallbackMethod = "fallback")
		public String consumer() {
			return restTemplate.getForObject("http://dalston-eureka-client/dc", String.class);
		}

		public String fallback() {
			return "fallback";
		}
	}

}
