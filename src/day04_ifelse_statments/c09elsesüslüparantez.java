package day04_ifelse_statments;

import java.util.Scanner;

public class c09elsesüslüparantez {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç adet ürün aldınız");
        int adet= scanner.nextInt();
        double urunfiyati=10;
        double toplamfiyat;

        if (adet>100){
            System.out.println("yüzde yirmi indirim kazandınız");
            toplamfiyat=adet*urunfiyati*100/80;
            System.out.println("toplam fiyat="+toplamfiyat);
    } else if (adet>50) {toplamfiyat=adet*urunfiyati*100/80;
            System.out.println("toplam fiyat="+toplamfiyat);

        }
        else {toplamfiyat=adet*urunfiyati;
            System.out.println("toplam fiyat="+toplamfiyat+"tl");}
        System.out.println("bizi tecih ettiğiniz çin teşekkürler");    }
}
