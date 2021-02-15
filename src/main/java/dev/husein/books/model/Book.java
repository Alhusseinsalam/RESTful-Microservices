package dev.husein.books.model;

import java.util.List;

public class Book {
    private String isbn;
    private String title;
    private List<Author> authors;

    Book(String title, String isbn, List<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + authors +
                '}';
    }
}
