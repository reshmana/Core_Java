package com.samples.association;

import com.samples.rules.Theater;
import com.samples.rules.TicketBooking;
import com.samples.rules.TicketBookingImpl;

public class TheatreRunner {

    public static void main(String[] args) {
        TicketBooking ticketBooking=new TicketBookingImpl();
        Theater theater=new Theater(ticketBooking);
        theater.sell(8);
        theater.cancel();


    }
}
