package org.kirillpastukhou.task16;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private Integer price;
    private Integer isbn;
    private static Integer edition;

    public Book(String title, String author, Integer price, Integer isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        edition = 1;
    }

    public Book(String title, Integer isbn) {
        this.title = title;
        this.author = "Джоан Роулинг";
        this.price = 9;
        this.isbn = isbn;
        edition = 1;
    }

    public Book(Integer price) {
        this.title = "Гарри Поттер и философский камень";
        this.author = "Джоан Роулинг";
        this.price = price;
        this.isbn = 0;
        edition = 2;
    }

    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.isbn = book.isbn;
    }

    @Override
    public Book clone() {
        Book other = null;
        try {
            other = (Book)super.clone();
            other.title = this.title;
            other.author = this.author;
            other.price = this.price;
        } catch (CloneNotSupportedException e) {
            return new Book(this);
        }
        return other;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Book other = (Book)obj;

        return  this.title.equals(other.title) &&
                this.author.equals(other.author) &&
                this.price.equals(other.price) &&
                this.isbn.equals(other.isbn);
    }

    @Override
    public int hashCode() {
        final int prime = 47;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + price;
        result = prime * result + isbn;
        return result;
    }

    @Override
    public String toString() {
        return  "Title of the Book is " + title +
                ". It's author is " + author +
                ". It costs " + price.toString() +  " dollars" +
                ". Edition of the book is " + edition.toString() +
                ". It's ISBN is " + isbn.toString() + ".";
    }

    @Override
    public int compareTo(Book other) {
        if (this.equals(other)) return 0;
        if (this.isbn < other.isbn) {
            return -1;
        } else {
            return 1;
        }
    }

    public Integer getISBN() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPrice() {
        return price;
    }

}
