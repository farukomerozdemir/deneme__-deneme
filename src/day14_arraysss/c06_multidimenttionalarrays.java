package day14_arraysss;

import java.util.Arrays;

public class c06_multidimenttionalarrays {
    public static void main(String[] args) {
        //tüm elenmntleri yazıdaracağız
        int[]arr={3,4,5,6};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");//3 4 5 6

        }
        int[][]sayilar={{3,4,5,6},{2,7},{1,5,8},{1}};
        System.out.println(Arrays.deepToString(sayilar));//[[3, 4, 5, 6], [2, 7], [1, 5, 8], [1]]

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                System.out.print(sayilar[i][j]);
                //3456271581

            }

        }
    }
}
