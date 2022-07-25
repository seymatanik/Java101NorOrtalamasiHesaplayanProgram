import java.util.Scanner ;

public class New {
    public static void main(String[] args) {
        double tutar ,  kdvOran = 0.18 ,KdvTutar , KdvliTutar ;

        Scanner input = new Scanner(System.in);
        System.out.print("ucret tutarini giriniz :" );

        tutar = input.nextDouble();

        KdvTutar =  kdvOran * tutar;
        KdvliTutar = tutar+ KdvTutar;

        System.out.println("KDV'siz Tutar :"+ tutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV Tutari : " + KdvTutar);
        System.out.println("KDV'li Tutari : " + KdvliTutar);





    }
}
