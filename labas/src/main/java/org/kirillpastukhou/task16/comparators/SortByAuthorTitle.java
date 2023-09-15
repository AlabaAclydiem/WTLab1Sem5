package org.kirillpastukhou.task16.comparators;

import org.kirillpastukhou.task16.Book;

import java.util.Comparator;

public class SortByAuthorTitle implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        if (b1.getAuthor().equals(b2.getAuthor())) {
            return b1.getTitle().compareTo(b2.getTitle());
        } else {
            return b1.getAuthor().compareTo(b2.getAuthor());
        }
    }
}
