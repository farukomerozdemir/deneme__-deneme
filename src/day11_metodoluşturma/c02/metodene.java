package day11_metodoluşturma.c02;

import day11_metodoluşturma.bclass;

public class metodene {
    public static void main(String[] args) {
        bclass.indirimlifiyathesapla(true,18,100);
    String isim="BÜLENT";
    String soyisim="YILMAZ";
    String isimsoyisim=isimdüzenle(isim,soyisim);
        System.out.println(isimsoyisim);
        System.out.println(isim+" "+soyisim);


    }

    private static String isimdüzenle(String isim, String soyisim) {
        String isimdüzenlenmiş=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyisimdüzenlenmiş=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
       return isimdüzenlenmiş+" "+soyisimdüzenlenmiş;


    }
}
