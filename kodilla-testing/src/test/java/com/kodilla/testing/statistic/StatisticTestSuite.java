package com.kodilla.testing.statistic;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class StatisticTestSuite {

    @Test
    public void testCalculateMemberNumberNormal(){
        StatistickMaker statistickMaker1 = new StatistickMaker();
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            list1.add("a");
        }

        when(statisticMock.usersNames()).thenReturn(list1);
        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(100, statistickMaker1.getMemberNumber());
    }

    @Test
    public void testCalculateMemberNumberZero(){
        StatistickMaker statistickMaker1 = new StatistickMaker();
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> list1 = new ArrayList<String>();


        when(statisticMock.usersNames()).thenReturn(list1);
        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(0, statistickMaker1.getMemberNumber());
        Assert.assertEquals(-1, statistickMaker1.getAveragePostsPerUser(), 0.1);
        Assert.assertEquals(-1, statistickMaker1.getAverageCommentsPerUser(), 0.1);

    }

    @Test
    public void testCalculatePostsNumberNormal(){
        StatistickMaker statistickMaker1 = new StatistickMaker();
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.postsCount()).thenReturn(1000);
        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(1000, statistickMaker1.getPostsNumber());
    }

    @Test
    public void testCalculatePostsNumberZero(){
        StatistickMaker statistickMaker1 = new StatistickMaker();
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.postsCount()).thenReturn(0);
        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(0, statistickMaker1.getPostsNumber());
        Assert.assertEquals(-1, statistickMaker1.getAverageCommentsPerPost(), 0.1);

    }

    @Test
    public void testCalculateCommentsNumberZero(){
        StatistickMaker statistickMaker1 = new StatistickMaker();
        Statistics statisticMock = mock(Statistics.class);

        when(statisticMock.commentsCount()).thenReturn(0);
        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(0, statistickMaker1.getCommentsNumber());

    }

    @Test
    public void testCalculateAveragePostsPerUser(){
        StatistickMaker statistickMaker1 = new StatistickMaker();
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            list1.add("a");
        }

        when(statisticMock.usersNames()).thenReturn(list1);
        when(statisticMock.postsCount()).thenReturn(1000);
        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(10, statistickMaker1.getAveragePostsPerUser(), 0.1);


    }

    @Test
    public void testCalculateaverageCommentsPerUser(){
        StatistickMaker statistickMaker1 = new StatistickMaker();
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            list1.add("a");
        }

        when(statisticMock.usersNames()).thenReturn(list1);
        when(statisticMock.commentsCount()).thenReturn(1000);
        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(10, statistickMaker1.getAverageCommentsPerUser(), 0.1);

    }

    @Test
    public void testCalculateaverageCommentsPerPostMorePosts(){
        Statistics statisticMock = mock(Statistics.class);
        StatistickMaker statistickMaker1 = new StatistickMaker();

        when(statisticMock.commentsCount()).thenReturn(100);
        when(statisticMock.postsCount()).thenReturn(1000);

        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(0.1, statistickMaker1.getAverageCommentsPerPost(),0.1);

    }

    @Test
    public void testCalculateaverageCommentsPerPostMoreComments(){
        Statistics statisticMock = mock(Statistics.class);
        StatistickMaker statistickMaker1 = new StatistickMaker();

        when(statisticMock.commentsCount()).thenReturn(1000);
        when(statisticMock.postsCount()).thenReturn(10);

        statistickMaker1.calculateAdvStatistics(statisticMock);

        Assert.assertEquals(100, statistickMaker1.getAverageCommentsPerPost(),0.1);

    }

}
