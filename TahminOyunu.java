import java.util.Random;
import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);


        Scanner input = new Scanner(System.in);

        int right = 0;

        int selected;

        int[] wrong = new int[5];

        while(right < 5) {

            System.out.print("Tahmininizi giriniz: ");
            selected = input.nextInt();

            if (selected<0 || selected>99) {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz!");
                continue;
            }

            if(selected == number) {
                System.out.println("Tebrik ederim. Doğru tahminde bulundunuz! Tahmin ettiğiniz sayı:  " + number );
                break;
            } else {

                System.out.println("Hatalı bir sayı girdiniz. ");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                }else {

                    System.out.println( selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;

                System.out.println("Kalan hakkınız: " + (5-right));
            }





        }


        System.out.println(number);

    }
}
