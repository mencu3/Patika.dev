import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        int sum=0;
        do{
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();
            if(number % 4 == 0){
                sum += number;
            }
        }while (number % 2 == 0);

        System.out.println("Toplam : " + sum);
    }
}
