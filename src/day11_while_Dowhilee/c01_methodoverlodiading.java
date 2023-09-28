package day11_while_Dowhilee;

public class c01_methodoverlodiading {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.substring(3));//a
        System.out.println(str.substring(3, 6));//a c
        // aynı isimde farklı signatureli metod var yazdığımız argümentlere göre uygun metodu çalıştırır
        //metod overloadind amacı aynı işlevi farklı şekillerde kullanabilmektir
        System.out.println(str.replace('a', 'b'));//Jbvb cbndir
        System.out.println(str.replace("dir", "midir"));//Java canmidir


    }
}
