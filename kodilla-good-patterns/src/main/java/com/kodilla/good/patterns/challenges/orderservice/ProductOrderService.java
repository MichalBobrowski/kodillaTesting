package com.kodilla.good.patterns.challenges.orderservice;

public class ProductOrderService {

    public static void main(String args[]) {

        RentRequest rentRequest = new RentRequest("Aneta", "ŻabiSklep", "JeżowySklep");

        InformationService informationService = new InformationService();
        RentalService rentalService = new RentalService();
        RentalRepository rentalRepository = new RentalRepository();
        RentalProcessor rentalProcessor = new RentalProcessor(informationService, rentalService, rentalRepository);

        rentalProcessor.process(rentRequest);
    }

}
