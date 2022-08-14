import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int r;
        int n;
        int combination ;
        Scanner input=new Scanner(System.in);

        System.out.println("Eleman sayiyisi (n):");
        n= input.nextInt();

        System.out.println("alt küme eleman sayisi(r)");
        r= input.nextInt();

        int total=1;
        for(int i =1 ;i<=n; i++){
            total *=i;
        }
        int total2 =1;
        for(int i = 1 ;i<=r; i++){
            total2 *=i;
        }
        int total3=1;
        for(int i = 1 ; i<=n-r ;i++){
            total3*=i;
        }
        combination=total / (total2 * total3);
        System.out.println("sayisinin kombinasyonu:"+combination) ;

    }
}
//C(n,r) = n! / (r! * (n-r)!)//