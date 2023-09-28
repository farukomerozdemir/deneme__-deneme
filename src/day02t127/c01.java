package day02t127;

import java.util.Scanner;

public class c01 {
    //exit code 0 yazarsa konsolda kodlarınız başarı ile gerçekleşti demektir
    public static void main(String[] args) {
        //scanner objesi oluşturduk
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String girilenİsim= scan.nextLine();
        System.out.println("yaşınızı giriniz");
        int yas= scan.nextInt();
        System.out.println("lütfen boyunuzu metre cinsinden giriniz");
        double boy= scan.nextDouble();
        System.out.println("isim="+girilenİsim
                +" yaş= "+yas+
                "boyunuz "+boy);

    }



    }

