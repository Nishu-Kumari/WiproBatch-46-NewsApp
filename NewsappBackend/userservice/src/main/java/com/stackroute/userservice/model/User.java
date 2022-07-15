package com.stackroute.userservice.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

/* @Entity: creates table of the class(class-User). */
@Entity
public class User {
	
	/* @Id: use to mark column as id(Primary Key). */
	@Id
	private String userId;
	private String firstName;
	private String lastName;
	private String password;

	/* @CreationTimeStamp - saves the date and time of when record is created */	
	@CreationTimestamp
	private Date createdDate;
	/**
	 * 
	 **/
	public User() {	}

	/**
	 * @param userId
	 * @param firstName
	 * @param lastName
	 * @param password
	 */
	public User(String userId, String firstName, String lastName, String password, Date createdDate) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.createdDate = createdDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
