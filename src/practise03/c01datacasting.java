package practise03;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class c01datacasting {
    public static void main(String[] args) {
        //double olarak verişlen sayının toplamını int olarak yazıdırınız
        double sayi1=12.5;
        double sayi2=24.6;
        double sayi3=10;
        int toplam= (int) (sayi1+sayi2+sayi3);
        System.out.println(toplam);
        double a=2,b=5,c=14;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char harf=scanner.next().charAt(0);
        System.out.println("girdiğiniz harf"+harf);
        System.out.println("girdiğiniz harften sonraki üç harf = "+(char)(harf+1)+(char)(harf+2)+(char)(harf+3));
        char f='g';
        System.out.println((char)(f+1));



    }
}
