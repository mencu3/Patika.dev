import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x,toplam=0,basamak=1,son;
        System.out.print("Lütfen Bir Sayı Giriniz :");
        x = scan.nextInt();

        while ( basamak > 0) {
            son = x%10;
            x /=10;
            basamak=x;
            toplam +=son;
            System.out.print(son+ " + " );
        }
        System.out.print(0+"\n");
        System.out.println("Girilen Sayının Basamaklarının Toplamı ="+toplam);

    }

}