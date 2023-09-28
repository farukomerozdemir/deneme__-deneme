package day13_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class c09_ikiArttırma {
    public static void main(String[] args) {


        int arrayuzunlugu;
        Scanner scanner=new Scanner(System.in);
        System.out.println("arrray uzunluğu giriniz");
        arrayuzunlugu=scanner.nextInt();
        int arr1[]= new int[arrayuzunlugu];
        int sayac=0;
        while (!(sayac==arrayuzunlugu)){
            for (int i = 0; i <arrayuzunlugu ; i++) {
                int eklenecekeleman=0;
                System.out.println("eklenecek ellemanı giriniz");
                eklenecekeleman=scanner.nextInt();

                          arr1[i]=eklenecekeleman;
                sayac++;



            }
            System.out.println(Arrays.toString(arr1));


        }





    }


}
