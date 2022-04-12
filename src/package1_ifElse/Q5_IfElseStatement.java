package package1_ifElse;

import java.util.Scanner;

public class Q5_IfElseStatement {
    public static void main(String[] args) {

    /*  TASK :
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */
        Scanner scan = new Scanner(System.in);


        System.out.print("1. sayiyi yaziniz = ");
         int x=scan.nextInt();

        System.out.print("2. sayiyi yaziniz = ");
        int y=scan.nextInt();

        System.out.print("3. sayiyi yaziniz = ");
         int z=scan.nextInt();

        if ((x*x) + (y*y) == (z*z)){

            System.out.println("Girdiginiz degerlerle bu bir dik ücgendir.");
        }else if((z*z) + (y*y) == (x*x)){

            System.out.println("Girdiginiz degerlerle bu bir dik ücgendir.");
        }else if((x*x) + (z*z) == (y*y)){

            System.out.println("Girdiginiz degerlerle bu bir dik ücgendir.");
        }else System.out.println("Dik ücgen degildir");



   }

}
