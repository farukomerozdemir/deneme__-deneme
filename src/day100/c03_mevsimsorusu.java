package day100;

import java.util.Scanner;

public class c03_mevsimsorusu {public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    System.out.println("ay numarasını yazınız");
    int ayno = scan.nextInt();
    switch (ayno){
        case 12:
        case 1:
        case 2:
            System.out.println("kış");break;
        case 3:
        case 4:
        case 5:
            System.out.println("ilkbahar");
        case 6:
        case 7:
        case 8:
            System.out.println("yaz");break;
        case 9:
        case 10:
        case 11:
            System.out.println("sonbahar");break;
        default:

    }
}
}
