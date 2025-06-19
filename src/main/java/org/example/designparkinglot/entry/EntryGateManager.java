package org.example.designparkinglot.entry;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.ticket.Ticket;
import org.example.designparkinglot.vehicle.Vehicle;

public class EntryGateManager {

    public EntryGateManager(EntryGate entryGate) {
        this.entryGate = entryGate;
    }

    private EntryGate entryGate;

    public EntryPass handleRequest(String vehicleId, String vehicleType){
        Vehicle vehicle = entryGate.registerVehicle(vehicleId, vehicleType);
        ParkingSpot parkingSpot = entryGate.assignParkingSpot(vehicle);
        Ticket ticket = entryGate.generateTicket(vehicle);
        return new EntryPass(vehicle, ticket, parkingSpot);
    }
}
