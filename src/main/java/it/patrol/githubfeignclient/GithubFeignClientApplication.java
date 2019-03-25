package it.patrol.githubfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "it.patrol.githubfeignclient.remote")
public class GithubFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubFeignClientApplication.class, args);
	}

}
