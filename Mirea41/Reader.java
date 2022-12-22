package com.Mirea41;

public class Reader {
    private String fullName;
    private String id;
    private String faculty;
    private int yearOfBorn;
    private String number;

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    public void takeBook(String ... str){
        System.out.print(this.fullName + " vzyal knigi: ");
        System.out.print(str[0]);
        for (int i = 1; i < str.length; i++) {
            System.out.print(", " + str[1]);
        }
        System.out.println();
    }

    public void takeBook(int count){
        System.out.println(this.fullName + " vzyal " + count + " knigi");
        System.out.println();
    }

    public void takeBook(Book ... book) {
        System.out.print(this.fullName + " vzyal knigi: ");
        System.out.print(book[0].getName());
        for (int i = 1; i < book.length; i++) {
            System.out.print(", " + book[i]);
        }
        System.out.println();
    }

    public void returnBook(String ... str){
        System.out.print(this.fullName + " vernul knigi: ");
        System.out.print(str[0]);
        for (int i = 1; i < str.length; i++) {
            System.out.print(", " + str[1]);
        }
        System.out.println();
    }

    public void returnBook(int count){
        System.out.println(this.fullName + " вернул " + count + " книги");
    }

}
