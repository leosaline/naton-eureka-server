package com.saline.naton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NatonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatonEurekaServerApplication.class, args);
	}

}
