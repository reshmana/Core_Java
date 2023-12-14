package com.Xwokrz.dto.ideas;

public abstract class RecievedPackage extends AbstractDeliveryPackage {
    @Override
    public void delivery() {
        System.out.println("running delivery in RecievedPackage");
    }
}
