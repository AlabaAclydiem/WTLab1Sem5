package org.kirillpastukhou.task14;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(12);
        Book book2 = book1.clone();
        System.out.println(book1.equals(book2));
    }
}