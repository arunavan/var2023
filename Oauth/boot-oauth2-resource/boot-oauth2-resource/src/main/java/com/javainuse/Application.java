package com.javainuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableResourceServer
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}


/*
{
"access_token": "58569a86-2626-4193-b066-eaac3f2db57b",
"token_type": "bearer",
"expires_in": 43199,
"scope": "resource-server-read resource-server-write"
}


*/