import java.util.Scanner;

public class UstluSayiHesaplama {
    public static void main(String[] args) {
        int k,p,i;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        k = input.nextInt();
        System.out.print("Üs olacak sayı:");
        p = input.nextInt();
        int total=1;
        for (i=1;i<=p;i++){
            total*=k;
        }
        System.out.println("Toplam:" + total);

    }
}
