package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoeamBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        //Zadanie 7.1
        PoeamBeautifier poeamBeautifier = new PoeamBeautifier();

        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> "ABC " + text + " ABC"));
        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> text.toUpperCase()));
        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> text.replace(" ", "KUM")));
        poeamBeautifier.beautify("Zdanie do upiększenia", (text -> text.replaceAll("Zdanie", "Wyrażenie")));


        //Zadanie 7.3
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
