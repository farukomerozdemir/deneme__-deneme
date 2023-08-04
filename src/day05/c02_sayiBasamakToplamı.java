package day05;

import java.util.Scanner;

public class c02_sayiBasamakToplamı {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üç basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();
        int sayibasamaktoplami=sayi%10+(sayi/10)%10+(sayi/100)%10;
        System.out.println("sayının rakamlar toplamı "+ sayibasamaktoplami);
    }}

