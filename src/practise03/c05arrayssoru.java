package practise03;

public class c05arrayssoru {
    public static void main(String[] args) {
        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
        int arr[] = {1, 2, 3, 4, -6, 5,6};

System.out.println(pozitifsailaritoplayanmetodarrayda(arr));
    }

    public static int pozitifsailaritoplayanmetodarrayda(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }


        }return toplam;



    }

}
