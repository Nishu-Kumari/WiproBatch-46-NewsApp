package com.stackroute.userservice.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stackroute.userservice.exception.UserAlreadyExistsException;
import com.stackroute.userservice.exception.UserNotFoundException;
import com.stackroute.userservice.model.User;
import com.stackroute.userservice.repository.UserRepository;


/* @Service - to mark the class as a service provider. */
@Service
public class UserServiceImpl implements UserService {

	/* @AuotWired: wires the application parts together, on the fields, constructors, or methods in a component. */
	@Autowired
	private UserRepository userRepo;

	/* @Override: It is used to override the JPARepository methods for performing CURD operations. */
	@Override
	public boolean saveUser(User user) throws UserAlreadyExistsException {
		Optional<User> existingUser = userRepo.findById(user.getUserId());
		if (existingUser.isPresent()) {
			throw new UserAlreadyExistsException("User with id already exists");
		}
		userRepo.save(user);
		return true;
	}

	/* @Override: It is used to override the JPARepository methods for performing CURD operations. */	
	@Override
	public User findByUserIdAndPassword(String userId, String password) throws UserNotFoundException {
		User user = userRepo.findByUserIdAndPassword(userId, password);
		if (null == user) {
			throw new UserNotFoundException("UserId and Password mismatch");
		}
		return user;
	}


}

