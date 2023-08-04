package day09_nestedifelse;

import java.util.Scanner;

public class c01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınıızı giriniz");
        double yas= scan.nextDouble();
        System.out.println("cinsiyetinizi giriniz");
        String cinsiyet= scan.next();
    if (yas<0 ||yas>95){
         System.out.println("geçersiz yaş");}
    else if (yas >= 65 && cinsiyet.equalsIgnoreCase("erkek")) {
        System.out.println("erkek emekli olabilir");
    } else if (yas>=60 && cinsiyet.equalsIgnoreCase("KADIN")) {
        System.out.println("kadın emekli olabilir");
    } else if (yas<=65&& cinsiyet.equalsIgnoreCase("erkek")) {
        System.out.println("erkek emekli olamaz");
    } else if (yas<60 && cinsiyet.equalsIgnoreCase("kadın")) {
        System.out.println("kadın emekli olamaz");
    } else if ( !cinsiyet.equalsIgnoreCase("erkek")||!cinsiyet.equalsIgnoreCase("kadın")) {
        System.out.println("yanliş cinsiyet i s yet girdi iz");
    }
    }
    }




