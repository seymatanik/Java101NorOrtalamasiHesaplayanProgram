import java.util.Scanner;

public class TamBolunebilme {
    public static void main(String[] args) {
        int k; int toplam = 0; int sayiAdedi=0;double ortalama  ;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Giriniz :");
        k = input.nextInt();

        for (int i = 0; i <= k; i++ ) {
            if (i % 3 == 0 & i % 4 == 0) {
                System.out.println(i);
                toplam += i ;
                sayiAdedi++;
            }

        }
        ortalama=toplam/sayiAdedi;
        System.out.println("3'e ve 4'e tam bolunebilen sayilarin ortalamasi : " + ortalama);

    }
}