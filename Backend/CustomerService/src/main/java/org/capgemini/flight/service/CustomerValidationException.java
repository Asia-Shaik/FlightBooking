package org.capgemini.flight.service;

public class CustomerValidationException extends Exception {




public static final long serialVersionUID = 1L;



public String message;


public CustomerValidationException() {
super();
message = "Id already Existing";
}




public String getMessage(){

return message;
}

}

