package com.kodilla.testing.library;

import java.util.ArrayList;

public class LibraryUser {

    String firstname;
    String lastname;
    String peselId;
    ArrayList<Book> listOfBorrowedBooks;


    public LibraryUser(String firstname, String lastname, String peselId, ArrayList<Book> listOfBorrowedBooks) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
        this.listOfBorrowedBooks = listOfBorrowedBooks;
    }

    public LibraryUser(String firstname, String lastname, String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    public ArrayList<Book> getListOfBorrowedBooks() {
        return listOfBorrowedBooks;
    }

    public void setListOfBorrowedBooks(ArrayList<Book> listOfBorrowedBooks) {
        this.listOfBorrowedBooks = listOfBorrowedBooks;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryUser that = (LibraryUser) o;

        if (!firstname.equals(that.firstname)) return false;
        if (!lastname.equals(that.lastname)) return false;
        if (!peselId.equals(that.peselId)) return false;
        return listOfBorrowedBooks.equals(that.listOfBorrowedBooks);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselId.hashCode();
        result = 31 * result + listOfBorrowedBooks.hashCode();
        return result;
    }
}
