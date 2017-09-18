package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void bigMacBuilderTest(){
        //given
        BigMac bigMac = new BigMac.BigMacBuilder()
                            .roll(new Roll("SesameRoll"))
                            .burgers(4)
                            .sauce(new Sauce("BBQ"))
                            .ingredients("bekon")
                            .ingredients("cebula")
                            .build();



        //when
        Roll expectedRoll = new Roll(Roll.SESAMEROLL);
        Sauce expectedSauce = new Sauce(Sauce.BBQ);

        Assert.assertEquals(expectedRoll.getRollType(), bigMac.getRoll().getRollType());
        Assert.assertEquals(4, bigMac.getBurgers() );
        Assert.assertEquals(expectedSauce.getSauceType(), bigMac.getSauce().getSauceType());
        Assert.assertEquals(2, bigMac.getIngredients().size());
    }

}
