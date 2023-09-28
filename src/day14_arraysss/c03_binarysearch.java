package day14_arraysss;

import java.util.Arrays;

public class c03_binarysearch {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,24,-25,26,5,5};
        //arr de beş var mı
        String[] isimler={"Ali","Esra","Omer","hüseyin","azim","hüseyin"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));//[Ali, Esra, Omer, azim, hüseyin]
        System.out.println(Arrays.binarySearch(isimler, "Esra"));//1
        System.out.println(Arrays.binarySearch(isimler,"Omer"));//2 ilk indeks veriyor
        System.out.println(Arrays.binarySearch(isimler,"hüseyi"));//-5
        //sort yapmadan aramımca ortalık karışıyor
        int[] arr2={1,2,3,4,24,-25,26,5,5};
        System.out.println(Arrays.equals(arr1,arr2));//true sort şekliibin de eşit olması lazım


    }
}
