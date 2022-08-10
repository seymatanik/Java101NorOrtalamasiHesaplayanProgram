import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int x,topla=0;

        do {
            System.out.print("Sayi giriniz : ");
            x = input .nextInt();
            if(x%2==0&&x%4==0)
            {
                topla+=x;
            }
        }while(x%2==1);
        System.out.print("toplam : "+topla);
    }
}



