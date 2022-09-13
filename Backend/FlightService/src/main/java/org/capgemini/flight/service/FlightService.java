package org.capgemini.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import org.capgemini.flight.model.Flight;
import org.capgemini.flight.repository.FlightRepository;

@Service
@Component
public class FlightService  implements FlightService1{
	
	
		//Calling Flight Repository
		private FlightRepository flightRepository;
		FlightService flightservice;

		@Autowired
		public FlightService(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
		}

		@Override
		public String addFlight(Flight flight) throws FlightValidationException  {
			if (flightRepository.existsById(flight.getId()))
				throw new FlightValidationException();
				else {    
		
			flightRepository.save(flight);
			 return "Added flight with id:"+ flight.getId();
		}


		}
		
		@Override
		public String deleteFlight(int id) {
			flightRepository.deleteById(id);
		return "id deleted";



		}


		@Override
		public Flight updateNameById(int id, Flight flight) {
			return flightRepository.save(flight);
		



		}



		@Override
		public List<Flight> getFlight() {
		return flightRepository.findAll();
		}

		public void save(Flight flight) {
			// TODO Auto-generated method stub
			
		}


		}
