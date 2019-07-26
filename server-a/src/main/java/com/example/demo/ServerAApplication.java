package com.example.demo;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDistributedTransaction
public class ServerAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerAApplication.class, args);
	}

}
