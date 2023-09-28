package day17constractors;

import java.util.ArrayList;
import java.util.List;

public class c02_runner {
    public static void main(String[] args) {
        c01_constrructors obj=new c01_constrructors();
        System.out.println(obj.sayi);//6 diğer klasdan aldı
        obj.rastgeleSayiUret();//Bugünki şanslı sayi:724
        obj.bugunneyapayim();//bugün yemek :pilav
        List<Integer>sayilar=new ArrayList<>();
        c01_constrructors obj2=new c01_constrructors();
        //new obj oluşturuken keyword  c01 () -->parantez ne demek bu constructer olduğunu ifDE EDER
        //C01 ()DEN () OBJ OLUŞTURAN DİNGİL COSNRRTRUCTER
        //constructer bir clasdan obje oluşturamk istediğimizde o objeye olşturuldupğu
        // classdaki veriable ve metodlar ile ilgili ilk atamayı(initialization)yapan yapıdır.
        //

    }
}
