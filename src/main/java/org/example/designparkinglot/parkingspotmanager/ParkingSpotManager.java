package org.example.designparkinglot.parkingspotmanager;

import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.vehicle.Vehicle;

public interface ParkingSpotManager {
    String getType();
    ParkingSpot assignParkingSpot(Vehicle vehicle);
    void vacate(ParkingSpot parkingSpot);
}
