import java.util.Scanner;

public class Zodyak {
    public static void main(String[] args) {
        int birthDate;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth mont between 0-12:");
        birthDate = input.nextInt();
        if (birthDate % 12 == 0) {
            System.out.println("Maymun");
        }else if (birthDate % 12 == 1){
            System.out.println("Horoz");
        }else if (birthDate % 12 == 2){
            System.out.println("Köpek");
        }else if (birthDate % 12 == 3){
            System.out.println("Domuz");
        }else if (birthDate % 12 == 4){
            System.out.println("Fare");
        }else if (birthDate % 12 == 5){
            System.out.println("Öküz");
        }else if (birthDate % 12 == 6){
            System.out.println("Kaplan");
        }else if (birthDate % 12 == 7){
            System.out.println("Tavşan");
        }else if (birthDate % 12 == 8){
            System.out.println("Ejderha");
        }else if (birthDate % 12 == 9){
            System.out.println("Yılan");
        }else if (birthDate % 12 == 10){
            System.out.println("At");
        }else if (birthDate % 12 == 11){
            System.out.println("Koyun");
        }
    }
}