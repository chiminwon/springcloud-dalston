package com.ming.springcloud;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DalstonConfigServerGitApp {

	public static void main(String[] args){
		new SpringApplicationBuilder(DalstonConfigServerGitApp.class).web(true).run(args);
	}
}
