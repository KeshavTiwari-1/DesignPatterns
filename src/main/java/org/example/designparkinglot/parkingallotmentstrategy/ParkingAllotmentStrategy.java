package org.example.designparkinglot.parkingallotmentstrategy;

import org.example.designparkinglot.parkingspot.ParkingSpot;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ParkingAllotmentStrategy {
    public ParkingSpot assignParkingSpot(List<ParkingSpot> parkingSpots){
        Optional<ParkingSpot> opt = parkingSpots.stream().filter(a -> !a.isOccupied()).findFirst();
        if(!opt.isPresent()) throw new RuntimeException("No Parking Spot Available");
        return opt.get();
    }
}
