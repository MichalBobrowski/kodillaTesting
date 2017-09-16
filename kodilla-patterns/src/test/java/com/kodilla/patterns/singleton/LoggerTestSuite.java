package com.kodilla.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {


    @Test
    public void logTest(){
        //given

        //when & then
        Logger.getInstance().log("User1");

    }

    @Test
    public void getLasLogTest(){
        //givrn
        //when
        Logger.getInstance().log("User2");
        String result = Logger.getInstance().getLastLog();

        //then
        Assert.assertEquals("User2", result );


    }
}
