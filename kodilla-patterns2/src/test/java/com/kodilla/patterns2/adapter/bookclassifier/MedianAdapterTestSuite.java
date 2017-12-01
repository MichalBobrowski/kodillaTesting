package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //given
        MedianAdapter adapter = new MedianAdapter();

        Book book1 = new Book("Me", "Why children cry and scream", 2016, "B1");
        Book book2 = new Book("You", "How to be a programmer with small child in house", 2017, "B2");
        Book book3 = new Book("Me and You", "Be happy as dad", 2015, "B3");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //when
        int result = adapter.publicationYearMedian(books);

        //then
        Assert.assertEquals(2016, result);
    }
}
