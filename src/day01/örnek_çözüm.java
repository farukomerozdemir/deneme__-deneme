package day01;

import java.util.Scanner;

public class örnek_çözüm {
    public static void main(String[] args) {
        ///*
        //Kullanicidan bir cumle alin
        //    - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //    - cumlede is geciyorsa, "calismak guzeldir"
        //    - ikisini de iceriyorsa "Hem ev lazim hem is"
        //    - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
        // */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        String cumle=scan.nextLine();
        String kucukcumle=cumle.toLowerCase();
        {if (kucukcumle.contains("ev")&&kucukcumle.contains("iş"));
        System.out.println("hem ev hem iş lazım");}
        { if (kucukcumle.contains("ev"))
            System.out.println("ev güzeldir");

    }}}
/*
ÖDEV-Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
basariyla kaydedildi" yazdirin
    - ilk harf kucuk harf olmali
    - son karakter rakam olmali
    - sifre bosluk icermemeli
    - uzunlugu en az 10 karakter olmali
 */

