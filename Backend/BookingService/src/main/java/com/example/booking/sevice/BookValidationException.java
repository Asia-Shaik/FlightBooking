package com.example.booking.sevice;

public class BookValidationException extends Exception {




public static final long serialVersionUID = 1L;



public String message;


public BookValidationException() {
super();
message = "Id already Existing";
}




public String getMessage(){

return message;
}

}

