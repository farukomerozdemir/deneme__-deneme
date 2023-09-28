package day15_multidimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class c07_kısayoldanlist_oluşturma {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,3,6,654,3,5,6,7,};
        //yukardaki elelmanların oludğu array list oluştur
        List<Integer>sayilar=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar);//arrayi liste ekledik
    }
}
