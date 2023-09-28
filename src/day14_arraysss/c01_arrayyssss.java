package day14_arraysss;

public class c01_arrayyssss {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        sonucu bize donduren bir method yaziniz.


         */
        int arr[]={3,4,5,-7,7,5,-1};

        System.out.println(pozitifsayilaritopla(arr));
    }
    public static int pozitifsayilaritopla(int[]arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){toplam+=arr[i];}

        }
        return toplam;
    }
}
