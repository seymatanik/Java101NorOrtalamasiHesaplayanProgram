import java.util.Scanner;

public class BoyKilo {
    public static void main(String[] args) {
        double boy , kilo  ;

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu metre cinsinden yaziniz:");
        boy = input.nextDouble();

        System.out.println("Kilonuzu kilogram cinsinden yaziniz :");
        kilo = input.nextDouble();


        double indeks = kilo/(boy*boy) ;

         System.out.print("Vucut kitle indeksiniz :" + indeks );

    }
}
