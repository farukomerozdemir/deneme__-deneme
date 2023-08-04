package day03;

import java.util.Scanner;

public class c02ödev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        char ilkharf=scan.next().charAt(0);
        System.out.println("girilem kelklimenin ilk harfi;"+ilkharf);
    }
}
