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
@RequestMapping("/admin")
@Api(value = "user", description = "Rest API for greeting admins", tags = "Admin API")
@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "OK"),
		@ApiResponse(code = 404, message = "The resource not found"),
		@ApiResponse(code = 401, message = "Unauthorized operation")})


public class HelloApiAdminController {
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Display greeting message to non-admin user", response = Greeting.class)
	public Greeting message(@PathVariable String name) {
		return new Greeting(name, "Hello admin " + name);
	}
}
