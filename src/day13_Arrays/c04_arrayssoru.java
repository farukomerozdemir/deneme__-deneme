package day13_Arrays;

public class c04_arrayssoru {
    public static void main(String[] args) {
        //string bir arrayde istenen harfi içeren elementleri yazıdr
        String [] isimler={"hüseyin","mehmet","esra","ercan","omer"};
        String istenenharf="a";
        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].contains("a")){
                System.out.println(isimler[i]);
            }//esra
            //ercan

        }
    }
}
