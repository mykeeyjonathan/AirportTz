package com.example.AIRPORTTZ.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceAirportImpl implements  AirportService{

    private AirportRepository airportRepository;

    @Override
    public Airport createAirport(Airport airport){
        return airportRepository.save(airport);
    }
    @Override
    public Airport getAirportById(Long airportId){
        Optional<Airport> optionalAirport =airportRepository.findById(airportId);
        return optionalAirport.get();
    }
    @Override
    public List<Airport> getAllAirports(){
        return airportRepository.findAll();
    }
    @Override
    public Airport updateAirport(Airport airport){
        Airport existingAirport =airportRepository.finfById(airport.getId()).get();
        existingAirport.setfirstname(airport.getfirstname());
        existingAirport.setlastname(airport.getlastname());
        existingAirport.setEmail(airport.getEmail());
        Airport updateAirport=airportRepository.save(existingAirport);
        return updateAirport;
    }
    @Override
    public void deleteAirport(Long airportId){
        airportRepository.deleteById(airportId);
    }

}
