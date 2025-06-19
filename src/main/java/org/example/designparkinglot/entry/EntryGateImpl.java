package org.example.designparkinglot.entry;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.parkingspotmanager.ParkingSpotManager;
import org.example.designparkinglot.ticket.Ticket;
import org.example.designparkinglot.vehicle.Vehicle;
import org.example.designparkinglot.vehicle.VehicleFactory;

public class EntryGateImpl implements EntryGate{

    private VehicleFactory vehicleFactory;
    private ParkingSpotManager parkingSpotManager;

    public EntryGateImpl(VehicleFactory vehicleFactory, ParkingSpotManager parkingSpotManager) {
        this.vehicleFactory = vehicleFactory;
        this.parkingSpotManager = parkingSpotManager;
    }

    @Override
    public Vehicle registerVehicle(String vehicleId, String vehicleType) {
        return vehicleFactory.generateVehicle(vehicleId, vehicleType);
    }

    @Override
    public Ticket generateTicket(Vehicle vehicle) {
        return new Ticket(vehicle);
    }

    @Override
    public ParkingSpot assignParkingSpot(Vehicle vehicle) {
        return parkingSpotManager.assignParkingSpot(vehicle);
    }
}
