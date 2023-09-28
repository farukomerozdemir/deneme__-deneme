package day13_Arrays;

import java.util.Arrays;

public class c03_arrays03 {
    public static void main(String[] args) {
        //verilen int bir arraydaki
        //tüm ellemntlerimn değerlerini iki arttırın
        int []arr={3,5,7,10};
        System.out.println(Arrays.toString(arr)+ "ilk hali");
        //[3, 5, 7, 10]ilk hali

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=2;

        }
        System.out.println(Arrays.toString(arr)+"son hali");
        //[5, 7, 9, 12]son hali

    }
}
