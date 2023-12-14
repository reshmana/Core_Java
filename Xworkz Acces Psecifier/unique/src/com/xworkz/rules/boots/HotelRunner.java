package com.xworkz.rules.boots;

import com.xworkz.rules.reshma.HotelRuleImpl;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("starting main in HotelRuleRunner");
        HotelRuleImpl hotelRule = new HotelRuleImpl();
        hotelRule.GuestRegistration();
        hotelRule.NoSmokingPolicy();
        hotelRule.QuietHours();
        hotelRule.safety();

        System.out.println("ending main in HotelRuleRunner");
    }
}

