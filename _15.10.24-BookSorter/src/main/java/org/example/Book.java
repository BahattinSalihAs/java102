package org.example;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    // Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır
    private String name;
    private int pageNumber;
    private String writerName;
    private String date;

    public Book(String name, int pageNumber, String writerName, String date) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writerName = writerName;
        this.date = date;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
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
                "name='" + name + '\'' +
                ", pageNumber=" + pageNumber +
                ", writerName='" + writerName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
    /*
    @Override
    public int compare(Book o1, Book o2) {
        //return o1.getName().compareTo(o2.getName());
        return o1.pageNumber - o2.pageNumber;
    }

     */
}
