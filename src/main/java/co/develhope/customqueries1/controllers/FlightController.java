package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.entities.FlightStatus;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("flights")
public class FlightController {

    @Autowired
    GenerateStringService stringGenerator;

    @Autowired
    FlightRepository flightRepo;

    @PostMapping("/")
    public List<Flight> generateFlights (@RequestParam Integer numberOfFlights){
        List<Flight> flights = new ArrayList<>();
        for(int i=0; i<numberOfFlights; i++)
        {
            Flight flight = new Flight();
            flight.setStatus(FlightStatus.ONTIME);
            flight.setDescription(stringGenerator.generate(20));
            flight.setFromAirport(stringGenerator.generate(5));
            flight.setToAirPort(stringGenerator.generate(5));
            flights.add(flight);
            FlightRepository.save(flight);
        }
        return flights;
    }

    @GetMapping("/")
    public List<Flight> getAllFlights () {
        return FlightRepository.findAll();
    }
}