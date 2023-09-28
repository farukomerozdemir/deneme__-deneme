package day02t127;

import java.util.Scanner;

public class c04_swap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı gir");
       double sayi1=scanner.nextDouble();
        System.out.println("ikinci sayiyi girniz");
        double sayi2=scanner.nextDouble();
        double sayi3;
        sayi3=sayi1;
        sayi1=sayi2;
        sayi2=sayi3;
        System.out.println(sayi1+" " +sayi2);
    }}
