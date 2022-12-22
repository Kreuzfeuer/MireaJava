package com.Mirea41;

public class ReaderTest {
    public static void main(String[] args) {
        var b = new Reader("Ivan Tver");
        b.takeBook(3);
        b.takeBook("Oleg","Tver");
        b.takeBook(new Book("Book"));
        b.returnBook("Oleg", "Tver");
    }
}
