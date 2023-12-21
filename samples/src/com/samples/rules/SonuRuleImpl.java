package com.samples.rules;

public class SonuRuleImpl implements  LibraryRule{
    @Override
    public boolean KeepSilence() {
        return true;
    }

    @Override
    public String MemberId() {
        return "SONU8296";
    }
}
