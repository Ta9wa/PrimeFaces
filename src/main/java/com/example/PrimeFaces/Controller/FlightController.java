package com.example.PrimeFaces.Controller;

import com.example.PrimeFaces.Flight;
import com.example.PrimeFaces.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RestController
@ViewScoped
public class FlightController implements Serializable {

    private Flight flight = new Flight();

    private List<Flight> flights = new ArrayList<>();

    @Autowired
    private FlightRepository flightRepository;

    public void fetchAll() {
        flights = flightRepository.findAll();
    }

    public void save() {
        flightRepository.save(flight);
        flight = new Flight();
        flights = flightRepository.findAll();
    }

    public void edit(Flight flight) {
        this.flight = flight;
    }

    public void delete(Flight flight){
        flightRepository.delete(flight);
    }

    public void refresh() {
        flight = new Flight();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

}