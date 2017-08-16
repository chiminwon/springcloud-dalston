package com.ming.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

	@Autowired
	DcClient dcclient;
	
	@GetMapping("/consumer")
	public String dc(){
		return dcclient.consumer();
	}
}
