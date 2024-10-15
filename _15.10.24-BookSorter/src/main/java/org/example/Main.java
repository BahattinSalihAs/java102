package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book bk1 = new Book("Bunları Anlatamamıştım",350,"Alişan Kapaklıkaya","15 Haziran");
        Book bk2 = new Book("Lord Of The Rings",650,"Mr. Jonathan","12 Mayıs");
        Book bk3 = new Book("Sol Ayağım",280,"Osman Sınav","14 Şubat");
        Book bk4 = new Book("Tarihi Bilimler",410,"Ilber Ortaylı","1 Ocak");
        Book bk5 = new Book("Yıldızlar Arasında",500,"Interstellar","23 Kasım");

        Set<Book> books = new TreeSet<>();
        books.add(bk1);
        books.add(bk2);
        books.add(bk3);
        books.add(bk4);
        books.add(bk5);

        Iterator<Book> itr = books.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("*********");

        Set<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });
        books1.add(bk1);
        books1.add(bk2);
        books1.add(bk3);
        books1.add(bk4);
        books1.add(bk5);

        Iterator<Book> itr1 = books.iterator();








    }
}