package day07_stringManipulations;

import java.util.Scanner;

public class c01_mailSorusu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mail adersininiz giriniz");
        String mail= scanner.nextLine();
        if (!mail.contains("@")){
            System.out.println("geçersiz mail");

        } else if (!mail.contains("@gmail.com")){
            System.out.println("mail @gmail.com olmalı");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");

        }


        }


    }

