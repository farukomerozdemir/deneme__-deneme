package day15_multidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c08_arraydakiTekraredenlerisilme {
    public static void main(String[] args) {

        int[]arr={2,3,4,5,3,6,654,3,5,6,7,};
        //bir list oluşturalım
        //arrayim elelmanlarını tek tek ele alalım

        List<Integer> uniqlist=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if (!uniqlist.contains(arr[i]))
                uniqlist.add(arr[i]);

        }
        System.out.println(uniqlist);
        int[]yeniarr=new int[uniqlist.size()];//uniqlistin sizesi kadar ellamn içermeli

        for (int i = 0; i < uniqlist.size() ; i++) {
            yeniarr[i]=uniqlist.get(i);

        }
        System.out.println(Arrays.toString(yeniarr));//[2, 3, 4, 5, 6, 654, 7]
    }
}
