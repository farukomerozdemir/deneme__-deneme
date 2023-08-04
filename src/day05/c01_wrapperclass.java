package day05;

public class c01_wrapperclass {
    public static void main(String[] args) {
        String str="Java";
        System.out.println(str.toUpperCase()) ;
        int sayi=20; //primitve data da method yok
        //wrapperclass primitiveler için hazır metod yapmaya yarar
        Integer sayiw=30;
        System.out.println(Integer.MAX_VALUE);
        char karakter='a';
        Character karakterr='b';
        System.out.println(Character.isDigit(karakterr));//false
        String str2="1234";
        String str3="1000";
        System.out.println(str3+str2);//12341000
        System.out.println(Integer.valueOf(str2)+Integer.valueOf(str3));//2234
        System.out.println(Integer.max(135,56));




    }
}
