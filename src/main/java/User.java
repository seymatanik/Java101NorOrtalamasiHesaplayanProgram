
import javax.swing.*;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        String userName , password , newPassword ,selection;
        Scanner input = new Scanner (System.in);

        System.out.println("kullanici adinizi giriniz :");
        userName = input.nextLine();

        System.out.println("sifrenizi giriniz");
        password = input.nextLine();
        if( userName.equals("seyma") && password.equals("1234")){
            System.out.println("giris basarili");
        }else {
            System.out.println("sifreniz yanlis");
        }
        System.out.println("sifrenizi degistirmek istiyor musunuz ?" );
        System.out.println("1- evet /n 2- hayir");
        selection = input.nextLine();

        switch (selection) {
            case:
                System.out.println("yeni sifrenizi giriniz :");
                newPassword = input.nextLine();
                if (newPassword.equals("1234")) {
                    System.out.println("yeni sifre olusturulamadi ! yeni sifreniz son 4 ay icinde kullandiginiz sifrelerden farkli olsun !");

                } else {
                    System.out.println("yeni sifreniz basari ile olusturuldu " + "/n yeni sifreniz " + newPassword);
                }
                break;
            case:
                System.out.println("hayir");

                break;
            default:
                System.out.println("giris basarisiz");
        }
        }


    }

