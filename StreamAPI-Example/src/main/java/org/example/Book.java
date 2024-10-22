package org.example;

public class Book {
    private String bookName;
    private int bookPage;
    private String writerName;
    private String date;

    public Book(String bookName, int bookPage, String writerName, String date) {
        this.bookName = bookName;
        this.bookPage = bookPage;
        this.writerName = writerName;
        this.date = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookPage=" + bookPage +
                ", writerName='" + writerName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
