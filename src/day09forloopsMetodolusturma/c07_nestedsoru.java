package day09forloopsMetodolusturma;

import java.util.Scanner;

public class c07_nestedsoru {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("satır sayısını giriniz");
        int satir= scanner.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j =1; j <=i ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println(" ");

        }
    }
}
