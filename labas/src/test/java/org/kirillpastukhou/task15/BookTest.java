package org.kirillpastukhou.task15;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void compareToTest() {
        ArrayList<Book> arr = new ArrayList<Book>();
        arr.add(new Book("Hello", 5));
        arr.add(new Book("Hi", 3));
        arr.add(new Book("Bad", 4));
        ArrayList<Book> correct = new ArrayList<Book>();
        correct.add(new Book("Hi", 3));
        correct.add(new Book("Bad", 4));
        correct.add(new Book("Hello", 5));
        Collections.sort(arr);
        for (int i = 0; i < correct.size(); ++i) {
            assertEquals(correct.get(i).getISBN(), arr.get(i).getISBN());
        }
    }
}