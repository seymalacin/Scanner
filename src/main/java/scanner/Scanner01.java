package scanner;

import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data amaya yarar, Scanner kullanici ile etkilesim kurmamizi saglar
    //Scanner bır java Class'idir, bu Cass2i kullanabilmek icin "imort" etmek gerekir.
    //SCANNER Class'i java nin util kutupahnesindndir,


    public static void main(String[] args) {

        //KULLANICIDAN DATA ALMAK ICIN YAPILMASI GEREKENLER
        //1.Adim: Scanner Class'indan object olusyurun

        Scanner input = new Scanner(System.in);//in sıstemın ıcınde yazdır

        //2.Adim: kullaniciya ne yapacagini soyle

        System.out.println("Hey kulanici yasini gir...");// out sıstemın dısında yazdır

        //3.Adim: kulanicidan aldıgınız data'yi bir variable'in icine koyun
        byte age = input.nextByte();

        System.out.println("Hey kulanici senin yasin" + age);


    }
}
