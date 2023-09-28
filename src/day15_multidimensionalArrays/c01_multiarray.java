package day15_multidimensionalArrays;

import java.util.Arrays;

public class c01_multiarray {
    public static void main(String[] args) {
        int[][]arr11={{1},{1,2},{3,4,8}};
        System.out.println(Arrays.deepToString(arr11));
        for (int i = 0; i < arr11.length ; i++) {
            for (int j = 0; j <arr11[i].length ; j++) {
                System.out.print(arr11[i][j]+" ");

            }

        }
    }
}
