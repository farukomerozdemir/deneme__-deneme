package day06_StrimgManipulation;

public class c01_toupperCase {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.toUpperCase());//JAVA CANDİR
        // değişiklikler strinigi atama olmadıkça değiştirmez
        System.out.println(str);//Java candir
        str=str.toUpperCase();
        System.out.println(str);//JAVA CANDİR

    }
}
