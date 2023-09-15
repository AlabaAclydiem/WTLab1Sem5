package org.kirillpastukhou.task12;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(12);
        Book book2 = new Book(12);
        Book book3 = new Book(13);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1);
    }
}