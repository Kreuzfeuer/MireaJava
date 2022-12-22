package com.Mirea2.Work2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        var books = new BookShelf();
        books.FillBookShelf(3);
        System.out.println(books);
        System.out.println(books.findNewest());
        System.out.println(books.findOldest());
        books.sort();
        System.out.println(books);
    }
}
