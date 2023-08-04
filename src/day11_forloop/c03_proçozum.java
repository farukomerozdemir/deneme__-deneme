package day11_forloop;

import java.util.Scanner;

public class c03_proçozum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int girilensayi= scan.nextInt();
        for (int i = girilensayi; i>0; i-=3) {
            System.out.print(i+" ");

        }
    }
}
