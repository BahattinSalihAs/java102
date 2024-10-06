package org.example;

public class LabAsistani extends Asistan{
    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }
    public void derseGir(){
        this.derseGir();
    }
    public void lablaraGir(){
        System.out.println(this.getAdSoyad() + " laboratuvar dersine giriyor...");
    }
}
