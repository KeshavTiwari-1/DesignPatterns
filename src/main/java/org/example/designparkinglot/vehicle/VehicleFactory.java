package org.example.designparkinglot.vehicle;

public class VehicleFactory {
    public Vehicle generateVehicle(String vehicleId, String vehicleType){
        return switch (vehicleType) {
            case "TWO_WHEELER" -> new TwoWheelerVehicle(vehicleId);
            case "FOUR_WHEELER" -> new FourWheelerVehicle(vehicleId);
            default -> throw new RuntimeException("Vehicle Not Supported");
        };
    }
}
