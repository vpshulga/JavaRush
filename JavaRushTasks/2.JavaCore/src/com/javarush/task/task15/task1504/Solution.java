package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";

            if (this instanceof MarkTwainBook){

                author = "Mark Twain";
                output = markTwainOutput;
            }
            else if (this instanceof  AgathaChristieBook) {
                output = agathaChristieOutput;

                author = "Agatha Kristie";
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book{
        private String title;
        public MarkTwainBook(String title) {
            super(title);
            this.title = title;
        }

        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    public static class AgathaChristieBook extends Book{
        private String title;
        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }

        public AgathaChristieBook(String title) {
            super(title);
            this.title = title;
        }
    }
}
