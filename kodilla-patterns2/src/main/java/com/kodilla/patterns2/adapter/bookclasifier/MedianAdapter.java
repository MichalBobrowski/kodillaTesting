package com.kodilla.patterns2.adapter.bookclasifier;


import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Statistic statistic = new Statistic();
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (Book bookA : bookSet ){
            books.put(new BookSignature(bookA.getSignature()), new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                    bookA.getAuthor(),
                    bookA.getTitle(),
                    bookA.getPublicationYear()));
        }
        return statistic.averagePublicationYear(books);
    }
}
