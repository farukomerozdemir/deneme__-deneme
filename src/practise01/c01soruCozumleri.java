package practise01;

import java.lang.reflect.Array;

public class c01soruCozumleri {
    public static void main(String[] args) {
        /* Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
        bir program yapmanız gerekmektedir. Her öğrenci için
        iki dönemlik (örneğin, ilk ve ikinci dönem)
        sınav notlarını saklamak için
        kullanmanız gerekmektedir.
        öğrencilere ait notları ve dönem ortalamasını hesaplayan
        Java programını yazınız:*/
        //multidmneitonal array;çoklu aray iç içe
        int[][] sinavnotlari = {{80, 100}, {75, 90}, {100, 100}, {60, 60}, {30, 90}};
        for (int i = 0; i < sinavnotlari.length; i++) {
            int ilkdonemnotu = sinavnotlari[i][0];
            int ikincidonemnotu = sinavnotlari[i][1];
            double ortalamanot = (ilkdonemnotu + ikincidonemnotu) / 2.0;
            System.out.println((i + 1) + ". notları");
            System.out.println("biirici dönem notu:" + ilkdonemnotu);
            System.out.println("ikinci döenm mnotu:" + ikincidonemnotu);
            System.out.println("ortalama notları :" + ortalamanot);
            System.out.println("------------");

        }


    }
}
