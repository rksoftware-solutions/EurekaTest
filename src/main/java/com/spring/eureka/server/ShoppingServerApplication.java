package com.spring.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingServerApplication {

	public static void main(String[] args) {
		
		/*
		 * RestTemplate rest = new RestTemplate(); HttpHeaders headers = new
		 * HttpHeaders(); String body = "";
		 * 
		 * HttpEntity<String> requestEntity = new HttpEntity<String>(body, headers);
		 * ResponseEntity<String> responseEntity = rest.exchange(
		 * "https://anypoint.mulesoft.com/mocking/api/v1/links/d6c96159-a38a-42cc-96fe-3f9f1116f97e/songs",
		 * HttpMethod.GET, requestEntity, String.class); HttpStatus status =
		 * responseEntity.getStatusCode(); String response = responseEntity.getBody();
		 * System.out.println("Response status: " + status);
		 * System.out.println(response);
		 */
		SpringApplication.run(ShoppingServerApplication.class, args);
	}

}
