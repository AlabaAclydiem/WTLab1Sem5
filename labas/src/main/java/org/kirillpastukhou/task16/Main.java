package org.kirillpastukhou.task16;

import org.kirillpastukhou.task16.comparators.SortByAuthorTitle;
import org.kirillpastukhou.task16.comparators.SortByAuthorTitlePrice;
import org.kirillpastukhou.task16.comparators.SortByTitle;
import org.kirillpastukhou.task16.comparators.SortByTitleAuthor;

import java.util.ArrayList;

public class Main {

    public static void printArr(ArrayList<Book> arr) {
        for (Book book : arr) {
            System.out.println(book);
        }
        System.out.println("______________________________________");
    }

    public static void main(String[] args) {
        ArrayList<Book> arr = new ArrayList<Book>();
        arr.add(new Book("a", "carvalol", 15, 1));
        arr.add(new Book("c", "balabol", 13, 0));
        arr.add(new Book("a", "balabol", 20, 1));
        arr.add(new Book("d", "carvalol", 17, 0));
        arr.add(new Book("d", "carvalol", 15, 1));
        arr.add(new Book("d", "carvalol", 16, 1));
        arr.sort(new SortByTitle());
        printArr(arr);
        arr.sort(new SortByTitleAuthor());
        printArr(arr);
        arr.sort(new SortByAuthorTitle());
        printArr(arr);
        arr.sort(new SortByAuthorTitlePrice());
        printArr(arr);
    }
}