package com.ltu.example.greetings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ltu.example.greetings.model.Greeting;
import com.ltu.example.greetings.model.User;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	@ApiOperation(value = "Display the list of users from db", response = User.class)
	public ResponseEntity userDetails() {
		List<User> userDetails = userService.getUserDetails();
		return new ResponseEntity(userDetails, HttpStatus.OK);
	}
}
