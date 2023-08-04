package day08;

import java.util.Scanner;

public class c075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        double sayi = scan.nextDouble();
        if (sayi % 15 == 0) System.out.println("süer sayı");
        else if (sayi % 5 == 0) System.out.println("sayı 5 e bölünüt");
        else if (sayi % 3 == 0) System.out.println("sayı 3 ebölünüt");
        else System.out.println("herhangi sayı");

        {

        }

    }
}
