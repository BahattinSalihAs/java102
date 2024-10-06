package org.example;

public class GuvenlikGorevlisi extends Memur{
    private String belge;
    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(this.getAdSoyad() + " nöbet tutuyor.");
    }

}
