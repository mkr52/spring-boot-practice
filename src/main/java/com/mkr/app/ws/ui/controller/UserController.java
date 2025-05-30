package com.mkr.app.ws.ui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mkr.app.ws.ui.model.request.UserRequestModel;
import com.mkr.app.ws.ui.model.response.UserRest;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping
	public String getUser(@RequestParam(value = "page", defaultValue = "1") int page,
			@RequestParam(value = "limit") int limit) {
		return "get user details with page = " + page + " and limit = " + limit;
	}

	@GetMapping(path = "/{userId}")
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		UserRest user = new UserRest();
		user.setFirstName("Firty");
		user.setLastName("dfkndfkd");
		user.setEmail("abc@auf.com");
		user.setUserId(userId);
		return new ResponseEntity<UserRest>(user, HttpStatus.OK);
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, 
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserRest> createUser(@Valid @RequestBody UserRequestModel userDetails) throws Exception {
		UserRest user = new UserRest();
		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		user.setEmail(userDetails.getEmail());
		return new ResponseEntity<UserRest>(user, HttpStatus.CREATED);
	}

	@PutMapping()
	public String updateUser() {
		return "";
	}

	@DeleteMapping()
	public String deleteUser() {
		return "";
	}

}
