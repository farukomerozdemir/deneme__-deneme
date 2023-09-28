package day14_arraysss;

import java.util.Arrays;

public class c04_Stringsplit {
    public static void main(String[] args) {

        String str="Yaklaşık 145.000.000 sonuç bulundu (0,30 saniye)";
        // arama sonuc sayısnın 1 milyondan çok olduğunu test edin
       String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); //[Yaklaşık, 145.000.000, sonuç, bulundu, (0,30, saniye)]
        // regex kısmına boşluk yazıdk boşlukları sildi kalan kısmını
                // array haline getirdi
        int sayi=Integer.parseInt(kelimeler[1].replaceAll("\\D",""));
        System.out.println(sayi);//145000000
        //İnteger.parseinteger metodu stringi int yaptı

        //multi dimentional olanları tostring ile görülmüyor deeptostring ile görünüyor



    }
}
