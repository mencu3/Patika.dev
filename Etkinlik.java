import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        String menu = """
                Hava sıcaklığı değeri 5'ten küçük ise 1'e basınız\s
                Hava sıcaklığı 5 ile 15 değeri arasında ise 2'ye basınız\s
                Hava sıcaklığı 15 ile 25 arasında ise 3'e basınız\s
                Hava sıcaklığı 25'ten fazla ise 4'e basınız.""";
        System.out.println(menu);
        System.out.print("Enter the heat:");
        heat = input.nextInt();
        switch (heat) {
            case 1 -> System.out.println("Kayak yap!");
            case 2 -> System.out.println("Sinema yap!");
            case 3 -> System.out.println("Piknik yap!");
            case 4 -> System.out.println("Yüzme yap!");
        }
    }
}
