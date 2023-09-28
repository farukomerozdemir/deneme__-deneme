package day06_StrimgManipulation;

public class c04_charAt {
    public static void main(String[] args) {
        String str="Java gun geçtikçe güzelleşiyor";
        //ilk harfi yazıdr
        System.out.println(str.charAt(0));//j
        System.out.println(str.endsWith("r"));//true
        System.out.println(str.length());//30
        System.out.println(str.charAt(str.length()-1));//r
        System.out.println(str.charAt(str.length()-str.length()));//0 ilk harf J
        

    }
}
