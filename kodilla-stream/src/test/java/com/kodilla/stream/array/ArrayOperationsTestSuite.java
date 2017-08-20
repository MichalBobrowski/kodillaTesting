package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //given
        int[] numbers = new int[20];
        for(int i = 0; i < 20; i++){
            numbers[i] = i+1;
        }

        Assert.assertEquals(10.5, ArrayOperations.getAverage(numbers), 0.001);

    }
}
