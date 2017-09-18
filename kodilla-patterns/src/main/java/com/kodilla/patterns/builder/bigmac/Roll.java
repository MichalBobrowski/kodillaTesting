package com.kodilla.patterns.builder.bigmac;

public class Roll {
    private String rollType;

    public final static String SESAMEROLL = "SesameRoll";
    public final static String NONSESAMEROLL = "NonSesameRoll";

    public Roll(String rollType) {
        if(rollType == SESAMEROLL || rollType == NONSESAMEROLL)
            this.rollType = rollType;
        else
            throw new IllegalStateException ("Roll type should be SesameRoll or NonSesameRoll");

    }

    public String getRollType() {
        return rollType;
    }
}
