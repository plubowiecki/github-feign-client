package it.patrol.githubfeignclient.cdto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCDto {

	private String login;
	private Long id;
	private String avatar_url;

}
