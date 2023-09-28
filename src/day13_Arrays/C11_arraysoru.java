package day13_Arrays;

import java.util.Arrays;

public class C11_arraysoru {
    /*
    Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun.
     */
    public static void main(String[] args) {
        int arr []={1,2,3,11,1,1,2};
        arraydakactanevar(arr,1);

    }

    public static void arraydakactanevar(int [] arr,int aranansayi){
        Arrays.sort(arr);
        int kactanevar=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==aranansayi)kactanevar+=1;





        }
        System.out.println("arrayda  "+kactanevar+"adet vardır  ");
        System.out.println(Arrays.toString(arr));
    }


    }

