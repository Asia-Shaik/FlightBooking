package org.capgemini.flight.service;

public class FlightValidationException extends Exception {




public static final long serialVersionUID = 1L;



public String message;


public FlightValidationException() {
super();
message = "Id already Existing";
}




public String getMessage(){

return message;
}

}
