package org.kirillpastukhou.task13;

public class ProgrammerBook extends Book {
    private String language;
    private Integer level;

    public ProgrammerBook(Integer price) {
        super(price);
        this.language = "Python";
        this.level = 11;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        ProgrammerBook other = (ProgrammerBook)obj;

        return  super.equals(other) &&
                this.language.equals(other.language) &&
                this.level.equals(other.level);
    }

    @Override
    public int hashCode() {
        final int prime = 47;
        int result = 1;
        result = super.hashCode();
        result = prime * result + ((language == null) ? 0 : level.hashCode());
        result = prime * result + level;
        return result;
    }

    @Override
    public String toString() {
        return  "Title of the Book is " + title +
                ". It's author is " + author +
                ". It costs " + price.toString() +  " dollars" +
                ". Edition of the book is " + edition.toString() +
                ". This book is about " + language + " with difficulty of " + level.toString() + " level.";
    }


}
