package day08;

import java.util.Scanner;

public class c01_İfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenarlarını veriniz"+"\nhey");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        if (kenar1==kenar2&&kenar2==kenar3){
            System.out.println("eşkenar üçgen");}
        else {
            System.out.println("00eşkenar üçgen değil");}


    }
}
