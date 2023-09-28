package day14_arraysss;

import java.util.Arrays;

public class c02_arrayssort {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,24,-25,26};
        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4, 24, -25, 26]
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));//[-25, 1, 2, 3, 4, 24, 26] sıralar
        String []arr2={"bali","sli","alivsn"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));//[alivsn, bali, sli] sıralayıp elimze verdi
        //sort kalıcı değişiklik yapar
        //striinglerde toupercase de kalıcı olmuyor


    }
}
