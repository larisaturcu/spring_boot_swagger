package com.ltu.example.greetings.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Greeting {
	@ApiModelProperty(notes = "Provided user name", required = true)
	private String player;
	@ApiModelProperty(notes = "Greeting message", required = true)
	private String message;

}
