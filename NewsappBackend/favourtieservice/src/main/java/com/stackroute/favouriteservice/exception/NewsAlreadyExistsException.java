package com.stackroute.favouriteservice.exception;

public class NewsAlreadyExistsException extends Exception
{
	/**
	 * 
	 */
	
	/* serialVersionUID: The serialization runtime associates with each serializable class a version number, called a serialVersionUID, which is
    					 used during deserialization to verify that the sender and receiver of a serialized object have loaded classes for that
    					 object that are compatible with respect to serialization. If the receiver has loaded a class for the object that has a
    				     different serialVersionUID than that of the corresponding sender's class, then deserialization will result in an 
    					 InvalidClassException. A serializable class can declare its own serialVersionUID explicitly by declaring a field named 
                         serialVersionUID that must be static, final, and of type long:
                         ANY-ACCESS-MODIFIER static final long serialVersionUID = 42L; */
	
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/* @Override: informs the compiler that the element is meant to override an element declared in a superclass. */
	@Override
	public String toString() {
		return "NewsAlreadyExistsException [message=" + message + "]";
	}

	public NewsAlreadyExistsException(String message) {
		super(message);
		this.message = message;
	}
	
	
}
