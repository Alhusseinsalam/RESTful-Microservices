package dev.husein.books.model;

import java.util.LinkedList;

public class Bookshelf {
    public LinkedList findAll() {
        LinkedList books = new LinkedList();

        LinkedList authors1 = new LinkedList();
        authors1.add(new Author("John Doe"));
        authors1.add(new Author("Mike Smith"));
        books.add(new Book("Test book 1", "13847282837823", authors1));

        LinkedList authors2 = new LinkedList();
        authors2.add(new Author("Katherine Nimic"));
        books.add(new Book("Test book 2", "217318218373", authors2));

        LinkedList authors3 = new LinkedList();
        authors3.add(new Author("Zeus"));
        authors3.add(new Author("Thor"));
        books.add(new Book("Test book 3", "31839319318931", authors3));

        return books;
    }

    public Book findByISBN(String isbn) {
        return null;
    }

    public void create(Book book) {

    }

    public boolean exists(String isbn) {
        if (this.findByISBN(isbn) == null) {
            return false;
        }

        return true;
    }


}
