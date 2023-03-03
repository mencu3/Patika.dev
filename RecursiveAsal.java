import java.util.Scanner;

public class RecursiveAsal {
    public static boolean prime(int number, int divider){
        if(number<2){
            return false;
        }else if(divider==1){
            return true;
        }else{
            if(number % divider==0){
                return false;
            }else {
                return prime(number, divider-1);
            }

        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi gir:");
        number = input.nextInt();
        if (prime(number,number/2)){
            System.out.println(number + "\nAsal sayıdır aferin!");
        } else {
            System.out.println(number + "\nAsal sayı değildir!! Niye girdin bunu!!!!!");
        }
    }
}
