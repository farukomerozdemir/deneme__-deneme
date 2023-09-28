package day17constractors;

public class c06_runner {
    public static void main(String[] args) {
        c05 obj=new c05();
        obj.metod1();//metod1 çalıştı
        System.out.println(obj.str);//null
        //default constructer görünmez
        // eğer bir classda görümen costrructer uyoksa defauşt cons varıdr
        // default const parametresizdir
        // cons bodysınde hicbirkod bulunmaz.
        //görünür const oluşuturnca default gider
        // constructer olması için class ismi ile aynı
        // return type olmamalıdır
    }
}
