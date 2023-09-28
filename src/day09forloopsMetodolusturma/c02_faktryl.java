package day09forloopsMetodolusturma;

import java.util.Scanner;

public class c02_faktryl {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scanner = new Scanner(System.in);
        System.out.println("faktöriyelini merak etttiğiniz sayıyı yazınız");
        int sayi = scanner.nextInt();
        int faktorsonuc = 1;
        System.out.print(sayi+"=");
        for (int i = 1; i <= sayi; i++) {
            faktorsonuc *= i;
            if (i!=sayi){
                System.out.print(i+" *");
            }else {
                System.out.print(i+" =");
            }

        }
        System.out.print("="+faktorsonuc);
    }
}
