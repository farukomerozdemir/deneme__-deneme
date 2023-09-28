package day12_scope;

import java.util.Scanner;

public class c01_while {
    public static void main(String[] args) {
        //kullanıcıdan toplanmak üzere sayılar isteyin toplam 500 olunca
        //şlemi durdur kaç sayı yazıldığı ve toplamı ver
        Scanner scanner=new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        int sayac=0;
        while (toplam<=500){
            System.out.println("lütfen toplanacak sayııyı giriniz");
            sayi= scanner.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println(sayac +"adet sayı girdiniz.sayıların toplamı="+toplam);
    }
}
