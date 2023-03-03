import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam:" + result);
        return a + b;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma:" + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma:" + result);
        return result;
    }

    static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Sıfıra bölünemez! TANIMSIZ");
            return 0;
        } else if (a == 0) {
            System.out.println("0'ın sayıya bölümü sıfırdır");
            return 0;
        }
        double result = a / b;
        System.out.println("Bölme:" + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++)
            result *= a;
        System.out.println("Üslü sayının cevabı:" + result);
        return result;
    }

    static int mod(int a, int b) {
        int result;
        result = a % b;
        System.out.println("Mod:" + result);
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Alan:" + (a * b));
        System.out.println("Çevres:" + (2 * (a + b)));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = """
                1-Toplama işlemi
                2-Çıkarma işlemi
                3-Çarpma işlemi
                4-Bölme işlemi
                5-Üslü Sayı Hesaplama
                6-Mod alma
                7-Dikdörtgen alan ve çevre hesabı
                0-Çıkış yap
                """;
        System.out.println(menu);
        do {
            System.out.print("Bir işlem seçiniz:");
            select = scan.nextInt();
            if (select == 0) {
                System.out.println("Çıkış yaptınız\n"+"BYEEEEEE");
                break;
            }
            if (select < 1 || select > 7) {
                System.out.println("Lütfen menüde yer alan bir numara giriniz");
                continue;
            }
            System.out.print("Birinci sayı:");
            int a = scan.nextInt();
            System.out.print("İkinci sayı:");
            int b = scan.nextInt();


            switch (select) {
                case 1 -> sum(a, b);
                case 2 -> minus(a, b);
                case 3 -> times(a, b);
                case 4 -> div(a, b);
                case 5 -> power(a, b);
                case 6 -> mod(a, b);
                case 7 -> calc(a, b);
            }
        } while (select!=0);

    }
}








