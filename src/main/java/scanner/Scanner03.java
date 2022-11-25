package scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {


        /*
         kulanıcıdan ilk, orta ve soy ismini,kimlik numaranızı alınız ve asagidaki formatta ekrana yazdiriniz
         Ali Mert Can
         123456789

         */
      //1.yol:
        Scanner input = new Scanner(System.in);
        System.out.println("ilk isminizi giriniz...");
         String ilkIsim = input.next();// next() methodu kullanicidan String datasi almak için kulanilir

        System.out.println("orta isminizi giriniz...");
        String ortaIsim = input.next();

        System.out.println("soy ismini giriniz...");
        String soyIsim = input.next();

        System.out.println("kimlik numaranizi giriniz...");
        String KimlikNO = input.next();

        System.out.println(ilkIsim +" " + ortaIsim+" "+ soyIsim);
        System.out.println(KimlikNO);

        //2.Yol:
        System.out.println("ilk , ota ve soy ismini ve kımlık nunaranızı giriniz...");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk +" " + orta + " " + soy);
        System.out.println(kimlik);

        /*
        next() ie nextLine() in farkı nedir?

        next() methodu kulanıcıdan geen Strıngın sadece ik kelımesını alır
        nextLine() methodu kuanıcıdan gelen Strıngın tamamını alır

         */




        //3. Yol :
        System.out.println("ilk , orta ve soy isminizi giriniz");

        String tamIsim = input.nextLine();
        System.out.println(tamIsim);
        System.out.println("kimlik nuöaranızı giriniz");
        String kımlıkNumarasi = input.next();
        System.out.println(kımlıkNumarasi);

        Scanner scan = new Scanner(System.in);
        System.out.println("ÜRÜN MİKTARİNİ SAYI OLARAK GİRİNİZ");
        int miktar = scan.nextInt();
        System.out.println("urun birim fıyatini giriniz");
        double fiyat = scan.nextDouble();
        double result = miktar>1000?fiyat*0.9*miktar:fiyat*miktar;
        System.out.println(result);




    }
}
