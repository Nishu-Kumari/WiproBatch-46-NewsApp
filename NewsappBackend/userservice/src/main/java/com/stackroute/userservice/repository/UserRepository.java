package com.stackroute.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.stackroute.userservice.model.User;


public interface UserRepository extends JpaRepository<User, String> {

	/* @Query - annotation declares finder queries directly on repository methods. */	
	@Query("Select user from User user where user.userId = (?1) and user.password = (?2)")
	User validate(String userId, String password);

	User findByUserIdAndPassword(String userId, String password);
}
