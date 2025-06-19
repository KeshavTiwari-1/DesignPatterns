package org.example.designparkinglot.parkingspotmanager;

import org.example.designparkinglot.parkingallotmentstrategy.ParkingAllotmentStrategy;
import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.vehicle.Vehicle;

import java.util.List;

public class ParkingSpotManagerImpl implements ParkingSpotManager{

    private static final String TYPE = "GENERAL_PARKING_MANAGER";
    private List<ParkingSpot> parkingSpotList;
    private ParkingAllotmentStrategy parkingAllotmentStrategy;

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public ParkingSpot assignParkingSpot(Vehicle vehicle) {
        ParkingSpot parkingSpot = parkingAllotmentStrategy.assignParkingSpot(parkingSpotList);
        parkingSpot.allote(vehicle);
        return parkingSpot;
    }

    @Override
    public void vacate(ParkingSpot parkingSpot) {
        parkingSpot.vacate();
    }
}
