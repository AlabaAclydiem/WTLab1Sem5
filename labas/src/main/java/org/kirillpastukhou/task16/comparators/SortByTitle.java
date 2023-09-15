package org.kirillpastukhou.task16.comparators;

import org.kirillpastukhou.task16.Book;
import java.util.Comparator;

public class SortByTitle implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
