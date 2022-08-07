import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int year, reminder;

        Scanner input = new Scanner(System.in);

        System.out.println("Dogum yilinizi giriniz :");
        year = input.nextInt();

        reminder = year % 12;
        if (reminder == 0) {
            System.out.println("Cin zodyagi burcunuz : MAYMUN ");
        } else if (reminder == 1) {
            System.out.println("HOROZ");
        } else if (reminder == 2) {
            System.out.println("KOPEK");
        } else if (reminder == 3) {
            System.out.println("DOMUZ");
        } else if (reminder == 4) {
            System.out.println("FARE");
        } else if (reminder == 5) {
            System.out.println("OKUZ");
        } else if (reminder == 6) {
            System.out.println("KAPLAN");
        } else if (reminder == 7) {
            System.out.println("TAVSAN");
        } else if (reminder == 8) {
            System.out.println("EJDERHA");
        } else if (reminder == 9) {
            System.out.println("YILAN");
        } else if (reminder == 10) {
            System.out.println("AT");
        } else if (reminder == 11) {
            System.out.println("KOYUN");
        }
    }
}