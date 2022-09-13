package org.capgemini.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.capgemini.flight.model.Flight;
import org.capgemini.flight.service.FlightService;
import org.capgemini.flight.service.FlightValidationException;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/flight")
public class FlightController {

	@Autowired
	private FlightService flightservice;
	private int id;

	@PostMapping("/addFlight")
	public String addFlight(@RequestBody Flight flight) throws FlightValidationException {
		return flightservice.addFlight(flight);
	}

	@GetMapping("/findAllFlight")
	public List<Flight> getflight() {
		return flightservice.getFlight();

	}

	@DeleteMapping("/delete/{id}")
	public String deleteFlight(@PathVariable int id) {
		flightservice.deleteFlight(id);
		return "flight deleted with id: " + id;

	}

	@PutMapping("/update/{id}")
	public Flight updateFlight(@PathVariable int id, @RequestBody Flight flight) {
		return flightservice.updateNameById(id, flight);

	}
}