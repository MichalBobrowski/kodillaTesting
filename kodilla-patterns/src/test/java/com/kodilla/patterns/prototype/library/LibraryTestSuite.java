package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //given
        Book book1 = new Book("Jak ugotować Żabe", "Niedźwiedź", LocalDate.of(2017,9,16));
        Book book2 = new Book("Zęby i kości", "Nieznany", LocalDate.of(2000,8,20));
        Book book3 = new Book("Jak rozpoznać dobrą kandydatkę na żone?", "Michał", LocalDate.of(2015,7,1));
        Book book4 = new Book("Unieważnie małżeństwa - jak poruszać się w prawie kanonicznym", "Zlaicyzowany teolog", LocalDate.of(2012,6,6));

        Library library = new Library("Biblioteka 1");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        library.setBooks(books);

        //when

        Library shallowClonedLibrary = null;
        try{
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Biblioteka 2");
        }catch(CloneNotSupportedException e){
            System.out.println(e);

        }

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka 3");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        Book book5 = new Book("Piata księga", "Piętaszek", LocalDate.of(1420,10,10));
        library.getBooks().add(book5);

        //then
        Assert.assertEquals(library.getBooks().size(), shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());


    }

}
