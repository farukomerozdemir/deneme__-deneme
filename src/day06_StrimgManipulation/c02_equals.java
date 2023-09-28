package day06_StrimgManipulation;

public class c02_equals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str8));//true
        System.out.println(str1.equals(str4));
        System.out.println(str1==str5);//true
        System.out.println(str1==str8);//false
        System.out.println(str1==str4);//false
        // == sağlıklı çalışmaz bazıları değişir
        // == bazen ture bazen false verir referanslara bakar
        // steak ve heap memory saklanmasına bakar o yüzden == değil equals sağlıklı

    }
}
