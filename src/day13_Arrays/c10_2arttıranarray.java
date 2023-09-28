package day13_Arrays;

import java.util.Arrays;

public class c10_2arttıranarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arayiikiarttirma(arr)));

    }
    public static int[] arayiikiarttirma (int [] arr){
        int []arr2=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i]=arr[i]+2;


        }System.out.println(Arrays.toString(arr2));
        return arr2;
    }
}
