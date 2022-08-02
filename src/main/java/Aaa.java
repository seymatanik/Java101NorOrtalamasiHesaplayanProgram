import java.util.Scanner;

public class Aaa {
    public static void main(String[] args) {

        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz :");
        number1 = input.nextInt();


        System.out.println("ikinci sayiyi giriniz :");
        number2 = input.nextInt();

        System.out.println("1-toplama /n 2-cikarma/n 3-carpma/n 4-bölme ");
        System.out.println("yapmak istediginiz islemi seciniz :");
        select = input.nextInt();

        switch (select){
            case 1 :
                System.out.println("sonuc : " + (number1+number2));
                break;
            case 2 :
                System.out.println("sonuc : " + (number1 - number2));
                break;
            case 3 :
                System.out.println("sonuc : " + (number1 * number2));
                break;
            case 4 :
                if (number2 != 0){
                    System.out.println("sonuc: " + (number1 / number2));
                }
                else {
                    System.out.println("bu sayi 0 a bölüneemez");
                }
                break;


            default:
                System.out.println("hatali secim yaptiniz.");
        }



    }
}