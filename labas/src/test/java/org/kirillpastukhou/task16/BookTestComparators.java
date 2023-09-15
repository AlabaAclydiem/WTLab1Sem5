package org.kirillpastukhou.task16;

import org.junit.jupiter.api.Test;
import org.kirillpastukhou.task16.comparators.SortByTitle;
import org.kirillpastukhou.task16.comparators.SortByTitleAuthor;
import org.kirillpastukhou.task16.comparators.SortByAuthorTitle;
import org.kirillpastukhou.task16.comparators.SortByAuthorTitlePrice;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BookTestComparators {
    private static ArrayList<Book> getArray() {
        ArrayList<Book> arr = new ArrayList<Book>();
        arr.add(new Book("a", "carvalol", 15, 1));
        arr.add(new Book("c", "balabol", 13, 0));
        arr.add(new Book("a", "balabol", 20, 1));
        arr.add(new Book("d", "carvalol", 17, 0));
        arr.add(new Book("d", "carvalol", 15, 1));
        arr.add(new Book("d", "carvalol", 16, 1));
        return arr;
    }

    @Test
    void compareToSortByTitle() {
        ArrayList<Book> origin = getArray();
        ArrayList<Book> correct = new ArrayList<Book>();
        correct.add(new Book("a", "carvalol", 15, 1));
        correct.add(new Book("a", "balabol", 20, 1));
        correct.add(new Book("c", "balabol", 13, 0));
        correct.add(new Book("d", "carvalol", 17, 0));
        correct.add(new Book("d", "carvalol", 15, 1));
        correct.add(new Book("d", "carvalol", 16, 1));
        origin.sort(new SortByTitle());
        for (int i = 0; i < correct.size(); ++i) {
            assertEquals(correct.get(i), origin.get(i));
        }
    }

    @Test
    void compareToSortByAuthorTitle() {
        ArrayList<Book> origin = getArray();
        ArrayList<Book> correct = new ArrayList<Book>();
        correct.add(new Book("a", "balabol", 20, 1));
        correct.add(new Book("c", "balabol", 13, 0));
        correct.add(new Book("a", "carvalol", 15, 1));
        correct.add(new Book("d", "carvalol", 17, 0));
        correct.add(new Book("d", "carvalol", 15, 1));
        correct.add(new Book("d", "carvalol", 16, 1));
        origin.sort(new SortByAuthorTitle());
        for (int i = 0; i < correct.size(); ++i) {
            assertEquals(correct.get(i), origin.get(i));
        }
    }

    @Test
    void compareToSortByTitleAuthor() {
        ArrayList<Book> origin = getArray();
        ArrayList<Book> correct = new ArrayList<Book>();
        correct.add(new Book("a", "balabol", 20, 1));
        correct.add(new Book("a", "carvalol", 15, 1));
        correct.add(new Book("c", "balabol", 13, 0));
        correct.add(new Book("d", "carvalol", 17, 0));
        correct.add(new Book("d", "carvalol", 15, 1));
        correct.add(new Book("d", "carvalol", 16, 1));
        origin.sort(new SortByTitleAuthor());
        for (int i = 0; i < correct.size(); ++i) {
            assertEquals(correct.get(i), origin.get(i));
        }
    }

    @Test
    void compareToSortByAuthorTitlePrice() {
        ArrayList<Book> origin = getArray();
        ArrayList<Book> correct = new ArrayList<Book>();
        correct.add(new Book("a", "balabol", 20, 1));
        correct.add(new Book("c", "balabol", 13, 0));
        correct.add(new Book("a", "carvalol", 15, 1));
        correct.add(new Book("d", "carvalol", 15, 1));
        correct.add(new Book("d", "carvalol", 16, 1));
        correct.add(new Book("d", "carvalol", 17, 0));
        origin.sort(new SortByAuthorTitlePrice());
        for (int i = 0; i < correct.size(); ++i) {
            assertEquals(correct.get(i), origin.get(i));
        }
    }
}