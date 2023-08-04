package day03;

import java.util.Scanner;

public class c01_scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("kullanıcı ismi :" +isim.toUpperCase());
        System.out.println("dairenin yarıçapını girniz");
double yarıçap= scan.nextDouble();

        System.out.println("dairenin alanı:"+3.14* yarıçap * yarıçap);


    }
}
