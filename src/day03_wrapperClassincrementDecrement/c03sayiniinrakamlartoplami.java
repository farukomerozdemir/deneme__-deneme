package day03_wrapperClassincrementDecrement;

import java.util.Scanner;

public class c03sayiniinrakamlartoplami {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("üç basmaklı sayı giriniz");
        int girilensayi=scanner.nextInt();
        int rakamlartopplamı=0;
        int rakam=0;
        rakam=girilensayi%10;
        rakamlartopplamı=rakamlartopplamı+rakam;
        girilensayi=girilensayi/10;
        rakam=girilensayi%10;
        rakamlartopplamı=rakamlartopplamı+rakam;
        girilensayi=girilensayi/10;
        rakam=girilensayi%10;
        rakamlartopplamı=rakamlartopplamı+rakam;
        girilensayi=girilensayi/10;
        rakam=girilensayi%10;
        rakamlartopplamı=rakamlartopplamı+rakam;
        girilensayi=girilensayi/10;
        System.out.println(rakamlartopplamı);

    }
}
