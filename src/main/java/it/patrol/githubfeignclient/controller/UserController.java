package it.patrol.githubfeignclient.controller;

import it.patrol.githubfeignclient.remote.GithubUserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

	private GithubUserClient githubUserClient;

	public UserController(GithubUserClient githubUserClient) {
		this.githubUserClient = githubUserClient;
	}

	@GetMapping(path = "/users")
	public ResponseEntity responseEntity() {
		return ResponseEntity.ok(githubUserClient.getUser("octocat"));
	}
}