package day05_nestedifElseTernaryswitch;

import java.util.Scanner;

public class c01_ifelse {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("cinsiyet gir");
        char cinsiyet = scanner.next().toLowerCase().charAt(0);
        System.out.println("yasını gir");
        double yas = scanner.nextDouble();
        if (yas < 20 || yas > 80 || !(cinsiyet == 'E' || cinsiyet == 'K')) {
            System.out.println("hatalı bilgi girdiniz");
        } else if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("erkek emekli olamaz");

        } else if (cinsiyet == 'K' && yas > 60) {
            System.out.println("kadın emekli olur");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("k emekli olamaz");


        }
    }}

