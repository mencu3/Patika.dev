import java.util.Scanner;

public class DordunVeBesinKatlari {
    public static void main(String[] args) {
        int p;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz : ");
        p = input.nextInt();

        for (int i = 1, j = 1; i <= p && j <= p; i *= 4, j *= 5) {
            System.out.println(i + "\t" + j);
        }
    }
}
