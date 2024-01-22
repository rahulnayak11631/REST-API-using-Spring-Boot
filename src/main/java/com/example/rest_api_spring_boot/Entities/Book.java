package com.example.rest_api_spring_boot.Entities;

public class Book {

    private int id;
    private String Book_Name;
    private String Author;

    public Book(int id, String book_Name, String author) {
        this.id = id;
        Book_Name = book_Name;
        Author = author;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String book_Name) {
        Book_Name = book_Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", Book_Name=" + Book_Name + ", Author=" + Author + "]";
    }
    

}
