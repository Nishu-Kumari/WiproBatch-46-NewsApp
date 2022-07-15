package com.stackroute.userservice.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.userservice.model.User;
import com.stackroute.userservice.services.SecurityTokenGenerator;
import com.stackroute.userservice.services.UserService;


/* @RestController: A convenience annotation of a @Controller and @ResponseBody.
   @RequestMapping: specify on the method in the controller, to map a HTTP request to the URL to this method.
   @CrossOrigin: A security concept that allows restricting the resources implemented in web browsers. */

@RestController
@RequestMapping("/api/v1/userservice")
@CrossOrigin
public class UserController {

	
	/* @AuotWired: wires the application parts together, on the fields, constructors, or methods in a component. */
	@Autowired
	private UserService userService;

	/* @AuotWired: wires the application parts together, on the fields, constructors, or methods in a component. */
	@Autowired
	private SecurityTokenGenerator tokenGenerator;
	
	
   /* @PostMapping: It is used to handle the HTTP POST requests matched with given URI expression. */
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody User user) {
		try {
			
			
			userService.saveUser(user);
			return new ResponseEntity<String>("User registered successfully", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
		}
	}
	
	 /* @PostMapping: It is used to handle the HTTP POST requests matched with given URI expression. */
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User loginDetail) {

		try {

			if (null == loginDetail.getUserId() || null == loginDetail.getPassword()) {
				throw new Exception("User Id or Password canot be empty.");
			}
			User user = userService.findByUserIdAndPassword(loginDetail.getUserId(), loginDetail.getPassword());
			Map<String, String> map = tokenGenerator.generateToken(user);
			return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.UNAUTHORIZED);
		}
	}
}