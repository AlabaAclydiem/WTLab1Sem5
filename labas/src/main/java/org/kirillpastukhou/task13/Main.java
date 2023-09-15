package org.kirillpastukhou.task13;

public class Main {

    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook(12);
        ProgrammerBook book2 = new ProgrammerBook(12);
        ProgrammerBook book3 = new ProgrammerBook(13);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book1);
    }
}