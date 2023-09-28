package day04_ifelse_statments;

import java.util.Scanner;

public class c03ifElse {
    public static void main(String[] args) {
        System.out.println("üçgenin kenarlarını giriniz");
        Scanner scanner = new Scanner(System.in);
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();
        if (kenar1 < 0 || kenar2 < 0 || kenar3 < 0) {
            System.out.println("kenarları doğru gir");}
        else if (kenar3 == kenar1 && kenar1 == kenar2) {
            System.out.println("eşkenar üçgendir");}
            else {
                System.out.println("eşkenaer değil");}
            //else if if doğru değilse aşağı geçer yoksa alta doğru devam eder doğruyu bulursa aşağı gitmez
        //else tek başına sadece if doğru değilse çalışır biter


        }


            }



