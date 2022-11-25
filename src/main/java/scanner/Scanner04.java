package scanner;

import java.util.Scanner;

public class Scanner04 {

      /*

     Not: char variable'lari matematiksek islemlerde kullanirsaniz, Java onlari ASCII degerlerini kullanir.
          ornegin: System.out.println('A' + 'C') ekrana AC yerine 132 yazdirir.

     Not2: Java'da "+" sembolunun iki anlami vardir. i)Toplama islemi  ii)Birlestirme islemi(Concatenation)
           Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestirme islemi yapmaya calisir, o da olmazsa hata verir.



  */


    public static void main(String[] args) {

        //Example: Kullanicidan ilk ve soy isminiz aliniz. Ilk ve soy isminin ilk harflerini ekrana yazdiriniz.
        //            Ali Can ==> AC


        Scanner input = new Scanner(System.in);
        //1.Yol:
        System.out.println("Ilk isminizi giriniz...");
        char ilk = input.next() .charAt(0); //a

        System.out.println("Soy isminizi giriniz...");

        char son = input.next() .charAt(0); //ilk karakter 0 dir. sonuc C yazar.

        System.out.println("" + ilk + son);// + isaretinin 2 anlami vardir. birinci anlami toplamadir. ikinci anlami birlestirmedir.
                                           // java ilk basta toplama yapar. yapamazsa eger sonra birlestirmeyi dener. onuda yapamazsa hata verir.

        //2.Yol:
        System.out.println("Tam isminizi giriniz...");

        String tamIsim = input.nextLine();// Ali Can
        char ilkHarf = tamIsim.charAt(0);
        System.out.println(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0); //split ==> parcalamak demek
        System.out.println(soyIsminIlkHarfi);

    }
    }

