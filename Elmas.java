import java.util.Scanner;
public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int p = input.nextInt();

        for (int i = 0; i <= p; i++) {
            for (int j = 0; j <= (p-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = (p-1); i >= 0; i--) {
            for (int j = 0; j <= (p-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
