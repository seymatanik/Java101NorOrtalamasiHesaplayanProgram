import java.util.Scanner;
public class Sinif {
    public static void main(String[] args) {
        int mat, kimya, fizik, turce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :");
        mat = input.nextInt();

        System.out.println("kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.println("fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.println(" Turkce notunuzu giriniz :");
        turce = input.nextInt();

        System.out.println("muzik notunuzu giriniz :");
        muzik = input.nextInt();

        if (mat< 0 || mat > 100 )
            mat = 0  ;
        if (kimya<0 || kimya>100)
            kimya = 0;
        if (fizik<0 || fizik >100)
            fizik = 0 ;
        if ( turce < 0 || turce>100)
            turce =0;
        if (muzik<0 || muzik >100)
            muzik = 0 ;


        double avarage = (mat + kimya + fizik + turce + muzik) / 5;

        if (avarage <= 55) {
            System.out.println("uzgunuz sinavi geçemediniz");
        } else {
            System.out.println("tebrikler sinavi geçtiniz");

        }
        System.out.println("ortalamaniz:" + avarage);
    }
}
