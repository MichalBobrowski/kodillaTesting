package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> usersList;

    public static List<ForumUser> getUsersList(){
        List<ForumUser> usersList = new ArrayList<>();

        usersList.add(new ForumUser(1, "Chrobak Chrobacki", 'M', LocalDate.of(1990, 10 , 24), 100));
        usersList.add(new ForumUser(2, "Abak Abacki", 'M', LocalDate.of(1998, 11 , 1), 1235));
        usersList.add(new ForumUser(3, "Lancelot Mały", 'M', LocalDate.of(468, 2 , 29), 543));
        usersList.add(new ForumUser(4, "Zbrodniarz Wojenny", 'M', LocalDate.of(1920, 8 , 18), 45));
        usersList.add(new ForumUser(5, "Muzyk Wiercipięta", 'M', LocalDate.of(1856, 9 , 11), 78));
        usersList.add(new ForumUser(6, "Babaka Babacka", 'K', LocalDate.of(2000, 10 , 12), 6543));
        usersList.add(new ForumUser(7, "Mistrzyni Buteleki", 'K', LocalDate.of(2017, 6 , 30), 0));
        usersList.add(new ForumUser(8, "Ewa bez Adama", 'K', LocalDate.of(1768, 7 , 24), 128));
        usersList.add(new ForumUser(9, "Maximus Prześcieradłus", 'M', LocalDate.of(135, 4 , 7), 763));
        usersList.add(new ForumUser(10, "Dabaka Dabacka", 'K', LocalDate.of(1992, 3 , 23), 765));
        usersList.add(new ForumUser(11, "Ebaka Ebacka", 'K', LocalDate.of(1991, 2 , 27), 890));

       return usersList;
    }

}
