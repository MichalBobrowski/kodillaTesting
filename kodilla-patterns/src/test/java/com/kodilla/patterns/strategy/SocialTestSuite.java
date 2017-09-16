package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class SocialTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //given
        Millenials millenials = new Millenials("Abacki");
        YGeneration yGeneration = new YGeneration("Babacki");
        ZGeneration zGeneration = new ZGeneration("Cabacki");

        //when & then
        Assert.assertEquals("Facebook", millenials.sharePost());
        Assert.assertEquals("Twitter", yGeneration.sharePost());
        Assert.assertEquals("Snapchat", zGeneration.sharePost());
    }

    @Test
    public void testIndividualSharingStrategy(){
        //given
        Millenials millenials = new Millenials("Abacki");

        //when
        millenials.setSocialPublisher(new SnapchatPublisher());

        //then
        Assert.assertEquals("Snapchat", millenials.sharePost());


    }
}
