package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import com.kodilla.testing.library.BookLibrary;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDataBaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDataBaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDataBaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDataBaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDataBaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDataBase libraryDatabaseMock = mock(LibraryDataBase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void noBookBorrowed(){
        LibraryUser libraryUser1 = new LibraryUser("A","B","1234");
        LibraryUser abstracktLibraryUser = new LibraryUser("Ac","Bc","12345");
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        BookLibrary bookLibrary1 = new BookLibrary(libraryDataBaseMock);

        when(libraryDataBaseMock.listBooksInHandsOf(abstracktLibraryUser)).thenReturn(listOfBooks);

        libraryUser1.setListOfBorrowedBooks((ArrayList<Book>) libraryDataBaseMock.listBooksInHandsOf(abstracktLibraryUser));
        List<Book> resultList =  bookLibrary1.listBooksInHandsOf(libraryUser1);

        Assert.assertTrue(resultList.isEmpty());

    }

    @Test
    public void oneBookBorrowed(){
        LibraryUser libraryUser1 = new LibraryUser("A","B","1234");
        LibraryUser abstracktLibraryUser = new LibraryUser("Ac","Bc","12345");
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        List listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("Beznazwy","Nieznany",1000));
        BookLibrary bookLibrary1 = new BookLibrary(libraryDataBaseMock);

        when(libraryDataBaseMock.listBooksInHandsOf(abstracktLibraryUser)).thenReturn(listOfBooks);
        libraryUser1.setListOfBorrowedBooks((ArrayList<Book>) libraryDataBaseMock.listBooksInHandsOf(abstracktLibraryUser));
        List<Book> resultList = bookLibrary1.listBooksInHandsOf(libraryUser1);

        Assert.assertEquals(1, resultList.size());
    }

    @Test
    public void fiveBookBorrowed(){
        LibraryUser libraryUser1 = new LibraryUser("A","B","1234");
        LibraryUser abstracktLibraryUser = new LibraryUser("Ac","Bc","12345");
        LibraryDataBase libraryDataBaseMock = mock(LibraryDataBase.class);
        List listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("Beznazwy1","Nieznany1",1000));
        listOfBooks.add(new Book("Beznazwy2","Nieznany2",1100));
        listOfBooks.add(new Book("Beznazwy3","Nieznany3",1200));
        listOfBooks.add(new Book("Beznazwy4","Nieznany4",1300));
        listOfBooks.add(new Book("Beznazwy5","Nieznany5",1400));
        BookLibrary bookLibrary1 = new BookLibrary(libraryDataBaseMock);

        when(libraryDataBaseMock.listBooksInHandsOf(abstracktLibraryUser)).thenReturn(listOfBooks);
        libraryUser1.setListOfBorrowedBooks((ArrayList<Book>) libraryDataBaseMock.listBooksInHandsOf(abstracktLibraryUser));
        List<Book> resultList = bookLibrary1.listBooksInHandsOf(libraryUser1);

        Assert.assertEquals(5, resultList.size());

    }


}
