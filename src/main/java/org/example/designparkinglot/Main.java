package org.example.designparkinglot;

import org.example.designparkinglot.entry.EntryGate;
import org.example.designparkinglot.entry.EntryGateImpl;
import org.example.designparkinglot.entry.EntryGateManager;
import org.example.designparkinglot.entry.EntryPass;
import org.example.designparkinglot.exit.ExitGate;
import org.example.designparkinglot.exit.ExitGateImpl;
import org.example.designparkinglot.exit.ExitGateManager;
import org.example.designparkinglot.parkingallotmentstrategy.ParkingAllotmentStrategy;
import org.example.designparkinglot.parkingspot.FourWheelerParkingSpot;
import org.example.designparkinglot.parkingspot.ParkingSpot;
import org.example.designparkinglot.parkingspot.TwoWheelerParkingSpot;
import org.example.designparkinglot.parkingspotmanager.ParkingSpotManager;
import org.example.designparkinglot.parkingspotmanager.ParkingSpotManagerImpl;
import org.example.designparkinglot.payment.PaymentCalculationService;
import org.example.designparkinglot.payment.PaymentCalculationServiceImpl;
import org.example.designparkinglot.payment.PaymentCollectService;
import org.example.designparkinglot.payment.PaymentCollectServiceImpl;
import org.example.designparkinglot.vehicle.VehicleFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Entry
        List<ParkingSpot> parkingSpotList = getParkingSpotList();
        ParkingSpotManager parkingSpotManager = new ParkingSpotManagerImpl(parkingSpotList, new ParkingAllotmentStrategy());
        VehicleFactory vehicleFactory = new VehicleFactory();
        EntryGate entryGate = new EntryGateImpl(vehicleFactory, parkingSpotManager);
        EntryGateManager entryGateManager = new EntryGateManager(entryGate);

        // Exit
        PaymentCalculationService paymentCalculationService = new PaymentCalculationServiceImpl();
        PaymentCollectService paymentCollectService = new PaymentCollectServiceImpl();
        ExitGate exitGate = new ExitGateImpl(parkingSpotManager, paymentCalculationService, paymentCollectService);
        ExitGateManager exitGateManager = new ExitGateManager(exitGate);


        EntryPass entryPass = entryGateManager.handleRequest("RJ33CA4408", "FOUR_WHEELER");
        exitGateManager.handleExit(entryPass);

    }

    private static List<ParkingSpot> getParkingSpotList() {
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        for(int i =0 ; i< 10; i++){
            parkingSpotList.add(new TwoWheelerParkingSpot());
        }

        for(int i =0 ; i< 10; i++){
            parkingSpotList.add(new FourWheelerParkingSpot());
        }
        return parkingSpotList;
    }
}
