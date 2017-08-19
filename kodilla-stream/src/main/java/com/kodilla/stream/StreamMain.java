package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Map<Integer, ForumUser> resultMap0fForumUsers = Forum.getUsersList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().getYear() > 20)
                .filter(user -> user.getPostNumber() > 0)
                .collect(Collectors.toMap(ForumUser:: getId, user -> user));

        resultMap0fForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue().getUserName())
                .forEach(System.out::println);


    }
}
