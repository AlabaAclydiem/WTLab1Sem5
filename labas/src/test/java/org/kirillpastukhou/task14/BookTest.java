package org.kirillpastukhou.task14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void cloneTest1() {
        Book book1 = new Book(15);
        Book book2 = book1.clone();
        assertEquals(book1, book2, "Test1 failed");
    }
}