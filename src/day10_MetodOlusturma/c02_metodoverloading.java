package day10_MetodOlusturma;

import java.util.Scanner;

public class c02_metodoverloading {
    public static void main(String[] args) {
        toplayazdir(5.6,4.6);
        toplayazdir(75,5);
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı gir");
        double sayi1= scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        toplayazdir(sayi1,sayi2);
    }
    public static void toplayazdir(double sayi1,double sayi2){
        System.out.println("verilen iki sayının toplamı :"+(sayi1+sayi2));
    }
}
