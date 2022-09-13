package org.capgemini.flight.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection="Flight")
public class Flight {
 @Id
private int id;
private int flightCharge;
private int flightNumber;
private String flightName;
private String fromLocation;
private String toLocation;
private String date;

public Flight() {
	
}



public Flight(int i,int i1, int i3, String string, String string2, String string3, String string4) {
	}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public int getFlightCharge() {
	return flightCharge;
}




public void setFlightCharge(int flightCharge) {
	this.flightCharge = flightCharge;
}




public int getFlightNumber() {
	return flightNumber;
}




public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}




public String getFlightName() {
	return flightName;
}


public void setFlightName(String flightName) {
	this.flightName = flightName;
}




public String getFromLocation() {
	return fromLocation;
}


public void setFromLocation(String fromLocation) {
	this.fromLocation = fromLocation;
}



public String getToLocation() {
	return toLocation;
}


public void setToLocation(String toLocation) {
	this.toLocation = toLocation;
}



public String getDate() {
	return date;
}


public void setDate(String date) {
	this.date = date;
}



public int updatedId() {
	return id; 
     }

}
