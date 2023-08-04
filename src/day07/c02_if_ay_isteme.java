package day07;

import java.util.Scanner;

public class c02_if_ay_isteme {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lğtfen bir harf giriniz");
        char girilenharf=scan.next().charAt(0);
        System.out.println(girilenharf);
        if (girilenharf=='o'){
            System.out.println("ocak");}
        if (girilenharf=='s'){
            System.out.println("subat");}
        if (girilenharf=='m'){
            System.out.println("mart");}
    }
}
