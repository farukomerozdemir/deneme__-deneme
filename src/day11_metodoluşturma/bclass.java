package day11_metodoluşturma;

import java.util.ArrayList;

public class bclass {
    public static void main(String[] args) {
        System.out.println("hello herkese");
        boolean uyemi=false;
        int uyelikyili=13;
        double satisfiyati=250;

        indirimlifiyathesapla(uyemi,uyelikyili,satisfiyati);
    }
    public static void indirimlifiyathesapla(boolean uyemi,int uyelikyili,double satisfiyati)
    {if (uyemi){
        if (uyelikyili<5){System.out.println("ürün fiyatı"+satisfiyati);
            System.out.println("indirim miktarı"+satisfiyati*10/100);
            System.out.println("indirimli fiyatı"+satisfiyati*90/100);

        }
        else {System.out.println("ürün fiyatı"+satisfiyati);
            System.out.println("indirim miktarı"+satisfiyati*15/100);
            System.out.println("indirimli fiyatı"+satisfiyati*85/100);

        }

        }else {
        System.out.println("ürün fiyatı"+satisfiyati);
        System.out.println("indirim miktarı"+satisfiyati*5/100);
        System.out.println("indirimli fiyatı"+satisfiyati*95/100);
    }
    }
}
