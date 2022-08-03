import java.util.Scanner;

public class FlighTicket {
    public static void main(String[] args) {
        int km , yas , tur ;
        double yas1 = 0.50,yas2=0.10,yas3=0.30,gdindirim=0.20,normalfiyat , yasindirimi;
        double toplam , yasindirimi1 , yasindirimi2,yasindirimi3,gdtoplam , toplam1 ;


        Scanner input =new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz :");
        km = input.nextInt();

        System.out.println("Yasinizi giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk turunu seciniz : /n1-Tek Yon /n2-Gidis-Donus");
        tur=input.nextInt();

        normalfiyat=km*0.10;
        if (km<1||yas<0){
            System.out.println("Hatali Giris ! Tekrar Deneyiniz");}
        else if (km>1 && tur == 1) {
            if (yas>0 && yas<12){
                toplam = normalfiyat / 2 ;
                System.out.println("ucak bileti fiyati :" + toplam);}
            else if (yas>= 12 && yas <= 24){
                toplam= normalfiyat*9/10;
                System.out.println("ucak bileti fiyati :"+toplam);}
            else if (yas>=25 && yas <=65 ){
                toplam=normalfiyat;
                System.out.println("ucak bileti fiyati:"+toplam);}
            else if(yas>65){
                toplam=normalfiyat*7/10;
                System.out.println("ucak bileti fiyati :" + toplam);}}

        else if( km>1  && tur==2){
            if (yas>0 && yas < 12){
                toplam1=normalfiyat/2;
                toplam=toplam1*8/10;
                System.out.println("ucak bileti fiyati :"+toplam);}
            else if (yas>=12 && yas<=24){
                toplam1=normalfiyat*9/10;
                toplam=toplam1*8/10;
                System.out.println("ucak bileti fiyati:"+toplam);}
            else if (yas >=25 && yas<=65) {
                toplam1=normalfiyat;
                toplam=normalfiyat*8/10;
                System.out.println("ucak bileti fiyati :"+toplam);}
            else if (yas>65){
                toplam1=normalfiyat*7/10;
                toplam=toplam1*8/10;
                System.out.println("ucak bileti fiyatı :"+toplam);}

        }



    }
}
