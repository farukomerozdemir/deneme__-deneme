package day13_Arrays;



public class c01_Arrays {
    public static void main(String[] args) {
        //array diziler ,bir veriableye birden faazzla değer atanabilir
        //array içinde aynı türde veriableler olmak orundadır
        // indeks yapısı vardır  arr[0] ilk rlsmnı verir
        // deklerasyonu önce data türü int+[]+arrayadı=
        // deklerayonda sonra int [] arr=new int[6] arraydaki eleman sayısı==lenght yazılmalıdır
        //atama yapmaz boş bırakırsak default atar 1
        int []arr=new int[5];
        int []arr2={4,1,7,5};
        // süslü parantez içine verableleri de yazabiliriz
        System.out.println(arr2[1]);//1
        System.out.println(arr[3]);//0 boş olduğu için default
        System.out.println(arr2[arr2.length-1]);//son elemaneti verir 5
        //System.out.println(arr[6]);//RTE .ArrayIndexOutOfBoundsException
       // arr2[5]=10;
        //System.out.println(arr2[5]);//arrayi büyütemiyoruz
        arr[0]=3;//ilk elemanı 3 yaptık artık
        //arr uzatmak için
        arr=new  int[10];
        ///arr uzattık önce



    }
}
