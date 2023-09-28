package day16_arraylistForloop;

import java.util.ArrayList;
import java.util.List;

public class c02_indexof {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("deniz");
        isimler.add("omer");
        isimler.add("esra");
        isimler.add("hamza");
        isimler.add("basak");
        isimler.add("esra");
        System.out.println(isimler);
        System.out.println(isimler.indexOf("esra"));//ilk esrayı verir 2
        System.out.println(isimler.lastIndexOf("esra"));//son esra 5
        System.out.println(isimler.indexOf("ali"));//-1
    }
}
