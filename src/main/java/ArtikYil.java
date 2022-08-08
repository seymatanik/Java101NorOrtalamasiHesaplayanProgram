import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year, mod4, mod100, mod400;

        Scanner input = new Scanner(System.in);
        System.out.println("Hesaplamak istediginiz yili giriniz: ");
        year= input.nextInt();

        mod4 = (year%4);
        mod100 = (year&100);
        mod400=(year&400);

        if(year<0){
            System.out.println("Heasplamak istediğiniz yil negatif olamaz");}
        else {
            if ( (mod4 !=  0 ) || (mod100 == 0 ) && ( mod400 == 0))
                System.out.println( year + "Artik yil degildir");
            else {
                System.out.println(year + "Artil yildir");
            }
        }


    }
}
