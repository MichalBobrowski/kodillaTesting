package com.kodilla.hibernate.manytomany.fascade;

public class SearchException extends Exception {

    public static String ERROR_NO_COMPANY = "No Company was found";
    public static String ERROR_NO_EMPLOYEE = "No Employee was found";

    public SearchException(String message){
        super(message);
    }
}
