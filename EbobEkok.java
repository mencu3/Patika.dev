import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz : ");
        int number2 = input.nextInt();

        if (number1 <= number2) {
            int ebob = 1, k = 1;
            while (k<=number1) {

                if (number1 % k == 0 && number2 % k == 0){

                    ebob=k;
                }
                k++;
            }System.out.println("Ebob="+ ebob);
            System.out.println("Ekok=" +(number1*number2)/ebob);
        }
        if (number2< number1) {
            int ebob = 1, k = 1;
            while (k<=number2) {

                if (number1 % k == 0 && number2 % k == 0){

                    ebob=k;
                }
                k++;
            }System.out.println("Ebob="+ebob);
            System.out.println("Ekok=" +(number1*number2)/ebob);
        }
    }
}
