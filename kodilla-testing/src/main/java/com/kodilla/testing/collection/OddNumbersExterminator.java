package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> onlyEven = new ArrayList<Integer>();
        for (int testingNumber  : numbers ) {
            if(testingNumber % 2 ==0 ) onlyEven.add(testingNumber);
        }

        return onlyEven;
    }

}
