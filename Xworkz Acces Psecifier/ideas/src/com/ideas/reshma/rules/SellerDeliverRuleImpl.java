package com.ideas.reshma.rules;

public  class SellerDeliverRuleImpl implements SellerRule,DeliveryRule{
    @Override
    public boolean replacement() {
        return true;
    }

    @Override
    public double deliveryCharges() {
        return 100;
    }

    @Override
    public boolean damaged() {
        return false;
    }

    @Override
    public int packed() {
        return 150;
    }
}
