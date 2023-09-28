package day10_MetodOlusturma;

public class c05_toplaDondur {
    public static void main(String[] args) {
        //verilen üç sayının toplamını donduren metod yazınız
        System.out.println(ucsayiyitopla(23, 3, 4));
        double sayi=ucsayiyitopla(34,53,23);
        System.out.println(sayi);//30.0
        //110.0
    }
    public static double ucsayiyitopla (double a,double b,double c){
        double toplam=a+b+c;
        return toplam;
    }
}
