package day11_while_Dowhilee;

import java.util.Scanner;

public class c03_whileLoop {
    public static void main(String[] args) {
        //kullancıadan sayılar iste kullanıcı sıfıra basıncaya kadar devam et
        //tekrar döngü sayısı bilinmiyorsa while kullanılır
        Scanner scanner=new Scanner(System.in);
        //örnek kullaıcnıdan şifre isterken program durmasın diye while looop

        double sayi= 44;
        double sum=0;
        while (sayi!=0)//sıfıra basana kadar devam edecek
        {
            System.out.println("sayi giriniz sıfıra basarsanız durur yoksa en son toplamı verir");
            sayi= scanner.nextDouble();
            sum+=sayi;

        }
        System.out.println("girilen syaıların toplamı :"+ sum);
    }
}
