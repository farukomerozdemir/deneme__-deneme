package day11_while_Dowhilee;

import java.util.Scanner;

public class c05_asalmiwhile {
    public static void main(String[] args) {
        //kullanıcadan sayı iste asal olana kadar yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("asal olup olmaığını merak ettiğiniz sayıyı giriniz+");
        int sayi = scanner.nextInt();
        boolean flag=true;
        for (int i = 2; i <sayi ; i++) {if (sayi%i==0){flag=false;break;}else flag=true;
        }
        if (flag=true) {System.out.println("sayı asaldır");} else System.out.println("sayi asal değildir");


    }}


