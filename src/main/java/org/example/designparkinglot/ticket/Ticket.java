package org.example.designparkinglot.ticket;

import org.example.designparkinglot.vehicle.Vehicle;

public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private Long entryTime;

    public Ticket(Vehicle vehicle) {
        ticketId = java.util.UUID.randomUUID().toString();
        this.vehicle = vehicle;
        entryTime = System.currentTimeMillis();
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Long getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Long entryTime) {
        this.entryTime = entryTime;
    }


}
