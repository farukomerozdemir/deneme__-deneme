package day09forloopsMetodolusturma;

import java.util.Scanner;

public class c07_nestedForLoopsoru {
    public static void main(String[] args) {
        //satır ve sütün numarasını al ve yılızlı şekik çizin
        Scanner scanner=new Scanner(System.in);
        System.out.println("satır");
        int satir= scanner.nextInt();
        System.out.println("sütun gir");
        int sütun= scanner.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sütun ; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }


    }
}
