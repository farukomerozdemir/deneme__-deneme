package day04;

public class c04datacasting {
    public static void main(String[] args) {
        int sayi=15;
        double ondalıklısayi;
        ondalıklısayi=sayi;
        ondalıklısayi=2.14;
        float hobi=3.15f;
        ondalıklısayi=hobi;
        System.out.println(ondalıklısayi);
        sayi=(int)ondalıklısayi;
        System.out.println(sayi);
        String isim=String.valueOf(hobi+sayi+"ondalıklısayi");
        System.out.println(isim);



    }
}
