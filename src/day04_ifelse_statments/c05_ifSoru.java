package day04_ifelse_statments;

import java.util.Scanner;

public class c05_ifSoru {
    //kullanııdan bir harf al harf ile başlayan aya varsa yazdır
    //büyük küçük harf hassasiyeti olmasın
    public static void main(String[] args) {
        System.out.println("lütfen bir harf giriniz");
        Scanner scan =new Scanner(System.in);
      char ilkharf=scan.next().charAt(0);
      //char scan kısmıında olmadığı için scan.next().charAt(0);
        //scan next yağıp.charat(0)yapıyoruz
        if (ilkharf=='o'||ilkharf=='O') System.out.println("ocak");
        if (ilkharf=='ş'||ilkharf=='Ş') System.out.println("şubat");
        if (ilkharf=='m'||ilkharf=='M') System.out.println("mart");

    }
}
