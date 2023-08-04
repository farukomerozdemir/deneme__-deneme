package day08;

import java.util.Scanner;

public class c0411 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kilonıuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy= scan.nextDouble();
        double vke=kilo*10000/(boy*boy);
        System.out.println("vke="+vke);
        if (vke>=30) System.out.println("obez");
        else if (vke>=25) System.out.println("kilolu");
        else if (vke>=20) System.out.println("normal");
        else System.out.println("zayıf");{

        }
        {

        }
    }
}
