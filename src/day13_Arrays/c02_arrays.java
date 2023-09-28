package day13_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class c02_arrays {
    public static void main(String[] args) {
        int[]arr={4,6,1,2};
        //yazdiralim
        System.out.println(arr);//[I@48140564 non primitelerin referansını yazıdırır
        System.out.println(Arrays.toString(arr));//[4, 6, 1, 2] bir virgül bir de boşluk oluçturdu
        //arrays klasından tostring overload edilmiş metodu kulandık
        String[]kelimeler={"Ali","okula","gitti."};
        System.out.println(Arrays.toString(kelimeler));//[Ali, okula, gitti]
        System.out.println(kelimeler[0]+kelimeler[1]+kelimeler[2]);//Aliokulagitti.
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }//4 6 1 2

    }
}
