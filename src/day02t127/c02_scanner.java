package day02t127;

import java.util.Scanner;

public class c02_scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kenar uzuunlukları giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        System.out.println("dikdörtgenin alanı="+kenar2*kenar1);

    }
}
