import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
        int a , b ;
        double c ;

        Scanner hipo = new Scanner(System.in);
        System.out.print("1.kenari giriniz : ");
        a = hipo.nextInt();
        System.out.print("2.kenari giriniz :");
        b = hipo.nextInt();

        c = Math.sqrt((a*a) + (b*b)) ;
        System.out.print("Hipotenus :" + c );
    }
}
