package org.capgemini.flight.service;

import java.util.List;

import org.capgemini.flight.model.Flight;

public interface FlightService1 {
	public String addFlight(Flight flight)throws FlightValidationException;  
	public List<Flight>getFlight();



	public String deleteFlight(int id);
	public Flight updateNameById(int id, Flight flight);
	}
