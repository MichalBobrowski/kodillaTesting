package com.kodilla.patterns2.fascade;

public class OrderProccesingException extends Exception {
    public static String ERR_NOT_AUTHORIZED = "User is not autohirzed";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR = "Verification erro";
    public static String ERR_SUBMITTING_ERROR = "Cannot Sublit order";

    public OrderProccesingException(String message){
        super(message);
    }
}