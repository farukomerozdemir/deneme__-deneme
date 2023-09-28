package day02t127;

import java.util.Scanner;

public class c03_scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim= scanner.nextLine();
        System.out.println("soyisminizi girniz");
        String soyisim=scanner.nextLine();
        System.out.println("yasını gir");
        int yas=scanner.nextInt();
        System.out.println("girilen bilgiler:"+isim.substring(0,1)+". "+soyisim+"yas=" +yas );
//nextten sonra next line yazınca porlem oluyor alırken


    }
}
