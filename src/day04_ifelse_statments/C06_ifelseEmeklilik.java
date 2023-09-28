package day04_ifelse_statments;

import java.util.Scanner;

public class C06_ifelseEmeklilik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("yaşınızı girniz");
        int yas=scanner.nextInt();
        System.out.println("cinsiyet giriniz");
        // ifler bağımsız olarak kendi bodyleri içinde çalışır
        //ifleri bağımlı hale getirmek için else if kullanırız
        //else iflerin hiç biri çalışmaz ise en osndaki else de ne yaızyorsa onu yazar
        char cinsiyet=scanner.next().charAt(0);
        if (yas>65){
            System.out.println("emekli olabilirisn");

        }
        else if ((cinsiyet=='e'|| cinsiyet=='E') && yas<=65) System.out.println("erkek emekli olamaz");

    }
}
