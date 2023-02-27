import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {

        int mathematic, physics, chemistry, turkish, history, music;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz :");
        mathematic = input.nextInt();

        System.out.print("Fizik notunuz :");
        physics = input.nextInt();

        System.out.print("Kimya notunuz :");
        chemistry = input.nextInt();

        System.out.print("Türkçe notunuz :");
        turkish = input.nextInt();

        System.out.print("Tarih notunuz :");
        history = input.nextInt();

        System.out.print("Müzik notunuz :");
        music = input.nextInt();

        int total = (mathematic + physics + chemistry + turkish + history + music);
        double result = total / 6.0;
        System.out.println("Ortalamanız : " + result);

        boolean condition = result >= 60;

        String str = condition ? "Geçti" : "Kaldı";
        System.out.println(str);

    }

}