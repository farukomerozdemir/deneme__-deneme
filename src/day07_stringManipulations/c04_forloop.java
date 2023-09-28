package day07_stringManipulations;

public class c04_forloop {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {System.out.print(i);

        }
        //0123456789d
        for (int i = 100; i <128 ; i+=2) {
            System.out.print(i+" ");
            //102 104 106 108 110 112 114 116 118 120 122 124 126bbbbb
        }
        //200-270 7 ile bölnen yaz
        for (int i =200; i <=270 ; i++) {
            if (i%7==0) System.out.print(i+" ");
         }

    }
}
