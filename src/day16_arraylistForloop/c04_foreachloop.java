package day16_arraylistForloop;

public class c04_foreachloop {
    public static void main(String[] args) {
        //for each loop birden fazla elelman içeren yapılarla çalışmak için
        // üretilmiştir
        //1den 100 e topla çarp tarzı işlemler için uygun değildir
        //array yada listteki tüm elelamnları getir demek için kullanılır
        //for each loop da üç şey var
        // 1-çalışacağımız element data türü
        // 2-loopiçinde gelen lelmanları hangi isimle kulancağız arrayda arr[i]
        // 3-üzerinde işlem yapacağımız cok elelmentli obje array olabilr
        int[]arr={2,4,5,6};
        //tüm elementleri yazdırın
        //tüm elemanları toplayın
        int toplam=0;
        int carpim=1;
        for (int each:arr
             ) {
            System.out.print(each+" ");
             toplam+=each;
             carpim*=each;

        }
        System.out.println("toplam;"+toplam);
        System.out.print(carpim);
    }}
