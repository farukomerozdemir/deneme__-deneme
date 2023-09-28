package day13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class c08_array {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturan ve bize donduren bir method olusturun.
        System.out.println(Arrays.toString(stringarrayoluşturanmetod()));
    }
    public static String[] stringarrayoluşturanmetod(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("array uzunluğunu giriniz");
        int arrlenght=scanner.nextInt();
        String[] kullaniciArrayi= new String[arrlenght];
        for (int i = 0; i < kullaniciArrayi.length ; i++) {
            System.out.println("arrayin elamanlarını giriniz");
            kullaniciArrayi[i]=scanner.next();

        }return kullaniciArrayi;
    }
}
