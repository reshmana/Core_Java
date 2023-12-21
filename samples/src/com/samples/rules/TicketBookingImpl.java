package com.samples.rules;

public class TicketBookingImpl implements TicketBooking {

    @Override
    public double buy(int quantity) {
        return 8;
    }

    @Override
    public boolean cancel() {
        return false;
    }
}
