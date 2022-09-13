package org.capgemini.flight.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.capgemini.flight.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, Integer>{

}
