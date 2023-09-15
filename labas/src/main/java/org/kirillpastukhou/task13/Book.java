package org.kirillpastukhou.task13;

public class Book {
    protected String title;
    protected String author;
    protected Integer price;
    protected static Integer edition;


    public Book(Integer price) {
        this.title = "Гарри Поттер и философский камень";
        this.author = "Джоан Роулинг";
        this.price = price;
        edition = 2;
    }

    public Book(String title, String author, Integer price, Integer _edition) {
        this.title = title;
        this.author = author;
        this.price = price;
        edition = _edition;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Book other = (Book)obj;

        return  this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.price.equals(other.price);
    }

    @Override
    public int hashCode() {
        final int prime = 47;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public String toString() {
        return  "Title of the Book is " + title +
                ". It's author is " + author +
                ". It costs " + price.toString() +  " dollars" +
                ". Edition of the book is " + edition.toString();
    }
}
