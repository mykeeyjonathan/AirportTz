package com.example.AIRPORTTZ.Service;

public interface AirportService {
    Airport createdAirport(Airport airport);
    Airport getAirportById(Long airportId);
    List<Airport> getAllAirports();
    Airport updateAirport(Airport airport);
    void deleteAirport(Long airportId);
}
