package day13_Arrays;

import java.util.Arrays;

public class C13_arraysoru {
    public static void main(String[] args) {// Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri
        // yazdiran bir method  olusturun.
       String[]arr={"ali","veli","hayati","melahat","mandalinaci"};
       enuzunenkısakim(arr);

    }
    public static void enuzunenkısakim  (String[]arr ){
        System.out.println(Arrays.toString(arr));
        String enuzunstr="";
        String enkısaisim=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            Arrays.sort(arr);
            System.out.println(arr[i]);

            if (arr[i].length()>enuzunstr.length()){enuzunstr=arr[i];}
            if (!(arr[i].length()>enkısaisim.length())){enkısaisim=arr[i];}

        }
        System.out.println("en uzun isim:"+enuzunstr);
        System.out.println(" en kısa isim:"+enkısaisim);


    }


}
