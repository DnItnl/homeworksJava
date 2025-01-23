package org.example.first;
public class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pages;
    
    public Book(String title, String author, int year, String publisher, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Методы вывода данных
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getPages() {
        return this.pages;
    }

   
    public void printInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year: " + this.year);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Genre: " + this.genre);
        System.out.println("Pages: " + this.pages);
    }

    public void printInfo(boolean brief) {
        if (brief) {
            System.out.println("Title: " + this.title + ", Author: " + this.author);
        } else {
            printInfo();
        }
    }

}
