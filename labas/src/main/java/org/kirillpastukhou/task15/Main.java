package org.kirillpastukhou.task15;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> arr = new ArrayList<Book>();
        arr.add(new Book("Hello", 5));
        arr.add(new Book("Hi", 3));
        arr.add(new Book("Bad", 4));
        Collections.sort(arr);
        for (Book book : arr) {
            System.out.println(book);
        }
    }
}