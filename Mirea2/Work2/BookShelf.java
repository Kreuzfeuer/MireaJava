package com.Mirea2.Work2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookShelf {
    private ArrayList<Book> books = new ArrayList<Book>();
    private int numberOfBook = 0;

    public BookShelf() {};

    public void addBook(Book newBook){
        books.add(newBook);
        System.out.println("Book added");
        numberOfBook++;
    }

    public void sort()
    {
        books.sort(
                    (a,b)->
                    b.getYear() - a.getYear()
                );
        System.out.println("Books sorted");
    }

    public Book findOldest()
    {
        if(!books.isEmpty()) {
            Book book = new Book();
            book.setYear(Integer.MIN_VALUE);
            for (var element : books) {
                if (book.getYear() < element.getYear())
                    book = element;
            }
            return book;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public Book findNewest()
    {
        if(!books.isEmpty()) {
            Book book = new Book();
            book.setYear(Integer.MAX_VALUE);
            for (var element : books) {
                if (book.getYear() < element.getYear())
                    book = element;
            }
            return book;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                ", numberOfBook=" + numberOfBook +
                '}';
    }

    public void FillBookShelf(int n) {
        var in = new Scanner(System.in);
        String author;
        String name;
        int year;
        Book book;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter author ");
            author = in.next();
            System.out.println("Enter book title ");
            name = in.next();
            System.out.println("Enter year ");
            year = in.nextInt();
            book = new Book(author, name, year);
            this.addBook(book);
        }
    }
}
