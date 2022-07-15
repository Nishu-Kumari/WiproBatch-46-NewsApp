package com.stackroute.userservice.exception;

public class UserNotFoundException extends Exception {

	/* serialVersionUID: The serialization runtime associates with each serializable class a version number, called a serialVersionUID, which is
                         used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that
                         object that are compatible with respect to serialization. If the receiver has loaded a class for the object that has a
                         different serialVersionUID than that of the corresponding sender's class, then deserialization will result in an 
                         InvalidClassException. A serializable class can declare its own serialVersionUID explicitly by declaring a field named 
                         serialVersionUID that must be static, final, and of type long:
                         ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L; */
	
	private static final long serialVersionUID = 5529833866229857888L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
