package day09forloopsMetodolusturma;

import java.util.Scanner;

public class c01_faktoriyel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("faktöriyelini merak etttiğiniz sayıyı yazınız");
        int sayi=scanner.nextInt();
        int faktorsonuc=1;
        for (int i = 1; i <=sayi ; i++)

        {
            faktorsonuc*=i;

        }
        System.out.println(faktorsonuc);
    }
}
