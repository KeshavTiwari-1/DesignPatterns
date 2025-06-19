package org.example.designparkinglot.entry;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.ticket.Ticket;
import org.example.designparkinglot.vehicle.Vehicle;

public interface EntryGate {
    Vehicle registerVehicle(String vehicleId, String vehicleType);
    Ticket generateTicket(Vehicle vehicle);
    ParkingSpot assignParkingSpot(Vehicle vehicle);
}
