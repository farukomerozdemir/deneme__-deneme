package day13_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class c12_arraysoru {
    public static void main(String[] args) {//Kullanicidan array’in boyutunu ve
        // elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.
        System.out.println(Arrays.toString(arrayolusturanmetod()));


    }


    public static int[]arrayolusturanmetod (){
        Scanner scanner=new Scanner(System.in);
        System.out.println("arrayin uzunluğunu giriniz");
        int arrayuzunluk;
        arrayuzunluk= scanner.nextInt();
        int []arr=new int[arrayuzunluk];
        for (int i = 0; i <arrayuzunluk ; i++) {
            System.out.println("arraye eklemek istediğiniz elemanları söyleyiniz");
            int eklenecekeleman= scanner.nextInt();
            arr[i]=eklenecekeleman;
        }
        System.out.println(Arrays.toString(arr));
        return arr;



    }


}
