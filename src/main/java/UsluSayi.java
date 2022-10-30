import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int n, k;
        int total = 1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("ussu alinacak sayiyiy giriniz :");
        n = input.nextInt();
        System.out.println("us olacak sayiyi giriniz :");
        k =input.nextInt();
        //mesela 3 üssü 4 istiyorsam 3 ü 4 defa 3 ile çarpmam gerekecek 3*3*3*3 //


        for(int i =1; i<=k ; i++){
            total*=n;

        }
        System.out.println(n+"ussu"+k+"="+ total);


    }
}
