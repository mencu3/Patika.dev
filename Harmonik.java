import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double k,i;
        System.out.print("Sayiyi giriniz:");
        k = input.nextInt();
        double total=0;
        for (i=1;i<=k;i++){
            total += 1/i;
        }
        System.out.println(total);

    }
}
