import java.util.Scanner;

public class SayiOrt {
    public static void main(String[] args) {
        int i,k;
        double toplam=0;
        double sayac=0;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz:");
        k = input.nextInt();
        for (i=0;i<=k;i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                toplam +=i;
                sayac +=1;
            }
        }
        double ortalama = toplam/sayac;
        System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4e tam olarak bölünen sayıların ortalaması:" + ortalama);
    }
}
