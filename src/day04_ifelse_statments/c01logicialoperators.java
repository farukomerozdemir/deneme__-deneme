package day04_ifelse_statments;

import java.util.Arrays;
import java.util.Scanner;

public class c01logicialoperators {
    public static void main(String[] args) {
        // && ve & farkı sadece ---&& olursa kalanına bakmaz.kötümser.
        // || or operatoru sadece biri doğru ise veya iyimser
        boolean c;
        int a=5;
        int b=3;
        System.out.println(c=a==b||a>b);//true a byüük b oldupu için
        System.out.println(c=a==b&&a>b);//falsea=!b olduğu için


    }
}
