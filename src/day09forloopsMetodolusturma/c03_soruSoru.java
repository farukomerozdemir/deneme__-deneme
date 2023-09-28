package day09forloopsMetodolusturma;

import java.util.Scanner;

public class c03_soruSoru {
    public static void main(String[] args) {
       //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("rakamlar toplamı merak ettiğiniz sayıyı giriniz");
        int sayi=scanner.nextInt();
        int rakamlartoplami=0;
        int rakam=0;
        for (int i =sayi; i >0 ; i/=10) {
            rakam=i%10;
            rakamlartoplami+=rakam;

        }
        System.out.println("rakamlar toplamı= "+rakamlartoplami);

    }
}
