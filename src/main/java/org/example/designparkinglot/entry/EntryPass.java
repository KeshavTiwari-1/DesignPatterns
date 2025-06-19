package org.example.designparkinglot.entry;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.ticket.Ticket;
import org.example.designparkinglot.vehicle.Vehicle;

public class EntryPass {
    private Vehicle vehicle;
    private Ticket ticket;
    private ParkingSpot parkingSpot;

    public EntryPass(Vehicle vehicle, Ticket ticket, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.ticket = ticket;
        this.parkingSpot = parkingSpot;
    }
}
