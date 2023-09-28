package day10_MetodOlusturma;

import java.util.Scanner;

public class c03_metod {
    public static void main(String[] args) {enBuyukSayiyazdir();
        //üç sayı al en büyük sayıyı yazdır
    }
    public static void enBuyukSayiyazdir(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("en byük sayııyı bulmak için sayı gir");
        double sayi1= scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        double sayi3= scanner.nextDouble();
        if (sayi2>sayi1&&sayi2>sayi3){ System.out.println("en büyük sayi ;"+sayi2);}
        else if (sayi3>sayi1&&sayi3>sayi2) {
            System.out.println("en büyük sayi ;"+sayi3);
            
        } else if (sayi1>sayi3&&sayi1>sayi2) {
            System.out.println("en büyük sayi ;"+sayi1);

        }
        else System.out.println("en büyük sayıyı bulamadım");
    }
}
