package day02;

import java.util.Locale;

public class veriables {
    public static void main(String[] args) {
        int sayi;//deklereasyon bir defa olur initialize
        sayi = 15;//değer ataması sınırısz kere olur.assignment...
        sayi = 20;
        System.out.println(sayi);
        String isim = "joe doe";
        isim.toUpperCase();
        System.out.println(isim);//joe doe
        System.out.println(isim.toUpperCase());
        isim = isim.toUpperCase();
        System.out.println(isim);
        char sayi1='a';
        String kablo="1kablo";
        System.out.println(kablo);
        System.out.println(kablo.substring(2,4));
    }
}
