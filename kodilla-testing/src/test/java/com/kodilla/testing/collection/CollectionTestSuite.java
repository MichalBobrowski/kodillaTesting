package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Rozpoczęto kolejny przypadek testowy ");
    }
    @After
    public void after(){
        System.out.println("Zakończono przypadek testowy.");
    }


    @Test
    public void testOddNumbersExterminatorEmptyList (){

        System.out.println(" Pusta Lista");

        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();

        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(emptyList);

        //Then
        ArrayList<Integer> emptyList2 = new ArrayList<Integer>();
        Assert.assertEquals(emptyList2, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        System.out.println(" Normalna Lista");

        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++){
            normalList.add(i);
        }
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(normalList);

        //Then
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        for (int i = 0; i < 6; i+=2){
            expectedList.add(i);
        }
        Assert.assertEquals(expectedList, result);

    }


}
