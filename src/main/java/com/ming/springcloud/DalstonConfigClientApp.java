package com.ming.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DalstonConfigClientApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DalstonConfigClientApp.class).web(true).run(args);
	}

}
