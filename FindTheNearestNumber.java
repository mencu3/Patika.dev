import java.util.Arrays;
import java.util.Scanner;

public class FindTheNearestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir sayı girin : ");
        int number = scn.nextInt();
        int max =  0 ;
        int min = 0 ;
        int[] dizi = {1, 2, 12, 21, 231, 32, 4, 10, -10, -1, 0 };
        Arrays.sort(dizi);
        for (int i  = 0 ; i < dizi.length;i++  ){
            if (number < dizi[i]){
                max  = dizi[i];
                min = dizi[i-1];
                break;
            }
        }
        System.out.println("En yakın ve en büyük deger : " + max);
        System.out.println("En küçük ve en yakın deger :  " + min);
    }
}
