package scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1: Sayiari kuanicidan alan ve yoplama ıslemı yapan kodu yazınız


        //1.Adim: Scanner Cass'indan obect olustur
        Scanner input = new Scanner(System.in);

        //2.Adim: Kullaniciya ne yapacagini soyle
        System.out.println("Ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("Ikinci sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1+ sayi2);
    }
}
