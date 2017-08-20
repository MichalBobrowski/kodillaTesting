package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class QuantityOfPeopleTestSuite {

    @Test
    public void getPeopleQuantityTest(){
        //given
        Country poland = new Country(new BigDecimal("3800000"));
        Country germany = new Country(new BigDecimal("8000000"));
        Country belgium = new Country(new BigDecimal("1200000"));
        Country italy = new Country(new BigDecimal("30000000"));
        Country uSA = new Country(new BigDecimal("120000000"));
        Country canada = new Country(new BigDecimal("60000000"));
        Country india = new Country(new BigDecimal("300000000"));
        Country china = new Country(new BigDecimal("500000000"));
        Country brunei = new Country(new BigDecimal("100000000"));
        Country somalia = new Country(new BigDecimal("4000000"));
        Country kongo = new Country(new BigDecimal("5000000"));
        Country etiopia = new Country(new BigDecimal("10000000"));

        Continent europe = new Continent(new ArrayList<>());
        Continent northAmerica = new Continent(new ArrayList<>());
        Continent asia = new Continent(new ArrayList<>());
        Continent africa = new Continent(new ArrayList<>());

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(belgium);
        europe.addCountry(italy);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(brunei);

        africa.addCountry(somalia);
        africa.addCountry(etiopia);
        africa.addCountry(kongo);

        northAmerica.addCountry(uSA);
        northAmerica.addCountry(canada);

        World world = new World(new ArrayList<>());

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(northAmerica);


        //when
        BigDecimal totalPeople = world.getPeopleQuantity();

        System.out.println(totalPeople);
        Assert.assertEquals(new BigDecimal("1142000000"), totalPeople);

    }
}