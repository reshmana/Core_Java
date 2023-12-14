package com.ideas.reshma.rules;

public class MetroContractor extends Contractor implements GarbageRule{
    @Override
    public void Segregation() {

    }

    @Override
    public boolean ProperDisposal() {
        return false;
    }
}
