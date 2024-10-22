package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Book sınıfından 10 tane nesne üretip bunu bir ArrayList yapısında saklayınız.
        // stream yapısını ve lambda ifadelerini kullanarak kitap isminin karşısında yazar
        // ismi olacak şekilde yeni bir Map<String, String> oluşturacak şekilde yazınız.
        Book bk1 = new Book("Yüzüklerin Efendisi",450,"Mr.Jonathan","23 Kasım");
        Book bk2 = new Book("Bunları Anlatamamıştım",310,"Alişan Kapaklıkaya","10 Ocak");
        Book bk3 = new Book("Sol Ayağım",280,"Cengiz Aytmatov","15 Haziran");
        Book bk4 = new Book("Olasılıksız",620,"Platon","16 Temmuz");
        Book bk5 = new Book("Eddie İle Büdü",150,"Ben","23 Mayıs");
        Book bk6 = new Book("Nasılsın?",450,"Ahmet Hamdi","23 Kasım");
        Book bk7 = new Book("Ottoman Empire",500,"Sultan Fatih","11 Mart");
        Book bk8 = new Book("Korkusuz Korkak",210,"Abuzeddin","18 Aralık");
        Book bk9 = new Book("Yoksul Baba",390,"Kahtalı Mıçe","22 Ekim");
        Book bk10 = new Book("Yüzüklerin Efendisi",450,"Mr.Jonathan","23 Kasım");

        List<Book> books = new ArrayList<>();
        books.add(bk1);
        books.add(bk2);
        books.add(bk3);
        books.add(bk4);
        books.add(bk5);
        books.add(bk6);
        books.add(bk7);
        books.add(bk8);
        books.add(bk9);
        books.add(bk10);

        books.stream().map(bk -> bk.getBookName() + " => " + bk.getWriterName()).forEach(i -> System.out.println(i));
        books.stream().filter(bk -> bk.getBookPage() < 200).forEach(i -> System.out.println(i));
    }
}