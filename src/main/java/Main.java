import java.util. Scanner;

public class Main {
    public static void main (String[] args ) {

        int mat , turkce , fizik , kimya , muzik , tarih ;

        Scanner input = new Scanner (System.in);

        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.print("Turkce Notunuz:");
        turkce=input.nextInt();

        System.out.print("Fizik Notunuzu :");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=input.nextInt();

        System.out.print("Muzik Notunuz:");
        muzik=input.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih=input.nextInt();
        int toplam = (mat + turkce + tarih + fizik + kimya + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz =" + sonuc);

        boolean kosul = sonuc >=60 ;
        String geçtiMİkaldiMİ = kosul ? "sinifi gecti " : "siniftan kaldı";
        System.out.print(geçtiMİkaldiMİ);
    }
}