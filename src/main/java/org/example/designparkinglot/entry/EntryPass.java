package org.example.designparkinglot.entry;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.ticket.Ticket;
import org.example.designparkinglot.vehicle.Vehicle;

public class EntryPass {
    private Vehicle vehicle;
    private Ticket ticket;
    private ParkingSpot parkingSpot;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public EntryPass(Vehicle vehicle, Ticket ticket, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.ticket = ticket;
        this.parkingSpot = parkingSpot;
    }
}
