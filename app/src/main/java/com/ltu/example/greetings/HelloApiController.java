package com.ltu.example.greetings;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ltu.example.greetings.model.Greeting;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value = "user", description = "Rest API for greeting user", tags = "User API")
@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
		@ApiResponse(code = 404, message = "The resource not found") })

public class HelloApiController {
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Display greeting message to non-admin user", response = Greeting.class)
	public Greeting message(@PathVariable String name) {
		Greeting msg = new Greeting(name, "Hello " + name);
		return msg;
	}
}
