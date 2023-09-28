package day05_nestedifElseTernaryswitch;

import java.util.Scanner;

public class c02_nestedİfELse {
    public static void main(String[] args) {


    /*
   Soru 1- Kullanicidan cinsiyetini ve yasini alin,
   Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
   Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
   “Emekli olmak icin ..
   Yil daha calisman gerekir” yazdirin.
     */
        //önce değişkenlerden birini ana değişken kabul edip,ona  göre devam et


        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyet gir");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("yasını gir");
        double yas = scanner.nextDouble();
        if (yas<20||!(cinsiyet=='E'||cinsiyet=='K')||yas>100){
            System.out.println("doğru gir");
        }

        else if (cinsiyet=='E'&&yas>=65){
            System.out.println("erkek emekkli olabilir");
        } else if (cinsiyet=='E'&&yas<65) {
            System.out.println("erkek emekli olmak için daha  "+(65-yas)+"yıl çalışmalııdır");

        } else if (cinsiyet=='K'&&yas>=60) {
            System.out.println("kadın emekli olur");}
        else if (cinsiyet=='K'&&yas<60) {System.out.println("kadın emekli olası için"+(60-yas)+"yıl daha çalışmalı");
        }

        }

    }



