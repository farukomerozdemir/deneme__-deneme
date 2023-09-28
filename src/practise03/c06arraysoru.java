package practise03;

import java.util.Arrays;

public class c06arraysoru {
    public static void main(String[] args) {

        int []arr={1,2,3,4,5};
        arraykaristirma(arr);


        System.out.println(Arrays.toString(arr));


    }
    // Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
    //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
    //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]



    public static void arraykaristirma(int[]arr)
    {
        int arr2[]=new int[arr.length];
        arr2[0]=arr[arr.length-1];
        for (int i = 1; i < arr.length ; i++) {
            arr2[i]=arr[i-1];

        }
        for (int i = 0; i < arr2.length ; i++) {
            arr[i]=arr2[i];

        }

        System.out.println(Arrays.toString(arr2));

    }
}


