package it.patrol.githubfeignclient.remote;

import it.patrol.githubfeignclient.cdto.UserCDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "users", url = "https://api.github.com")
public interface GithubUserClient {

	@GetMapping(value = "users/{username}")
	UserCDto getUser(@PathVariable("username")String username);

}
