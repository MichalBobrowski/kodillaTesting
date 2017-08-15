package com.kodilla.testing.statistic;

public class StatistickMaker  {

    private int memberNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){

        memberNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(memberNumber != 0)averagePostsPerUser = postsNumber / memberNumber;
        else averagePostsPerUser = -1.0;

        if(memberNumber != 0) averageCommentsPerUser = commentsNumber / memberNumber;
        else averageCommentsPerUser = -1.0;

        if(postsNumber != 0) averageCommentsPerPost = commentsNumber / postsNumber;
        else averageCommentsPerPost = -1.0;
    }

    public void showAdvStatisctics(){
        System.out.println("Liczba użytkowników wynosi: " + memberNumber);
        System.out.println("Liczba postów wynosi:  " + postsNumber);
        System.out.println("Liczba komenatrzy wynosi: " + commentsNumber);
        System.out.println("Srednia liczba postów na użytkownika: " + averagePostsPerUser);
        System.out.println("Srednia liczba komenatarzy na użytkownika: " + averageCommentsPerUser);
        System.out.println("Srednia liczba komentarzy na post: " + averageCommentsPerPost);
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
