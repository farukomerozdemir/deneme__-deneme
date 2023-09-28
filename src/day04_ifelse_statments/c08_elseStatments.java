package day04_ifelse_statments;

import java.util.Scanner;

public class c08_elseStatments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = scanner.nextInt();
        if (not < 0 || not > 100) {
            System.out.println("geçersiz not grdiniz");}

            else if (not >= 50)
            System.out.println("geçtiniz"); else

            System.out.println("kaldınız");

    }
}