package day12_scope;

public class c03scopeclassVeriables {


    String str="Java";
    int sayi=23;
    static boolean bl=true;
    static char chr='a';

    public static void main(String[] args) {
        //static int a=25;local veriableler içinde statik kuallnılnca kabubul etmez
        System.out.println(chr);
    }
    public static void statikmetod(){
        System.out.println(bl);
    }
    //statik olmayan metod halk plajı gibidir canı sıkılan girebilir bak hepsi çalışmış
    public void statikolmayanmetod(){
        System.out.println(bl);
        System.out.println(str);
        System.out.println(str);
        System.out.println(sayi);
    }
    //class lvl veriable class içinde main metod ve //
    // kod blokları dışında oluşturulur genelde en üstte yazılırlgduhhng bbjl
    //class levelde oluşturulan veriable scope u(geçerlilik allanı) tüm classdır ama statik koyunca başına
    //statik olanı diğer skoplardan kullanabildik
    //default değerler
    //chr 0 , int 0 ,strşng null ,boolen false ,

}
