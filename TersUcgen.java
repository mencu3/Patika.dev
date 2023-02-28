import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        System.out.print("Sayı Giriniz:");
        number = input.nextInt();

        for (int i = number; i >= 1; i--) {
            for (int k = number - i; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
