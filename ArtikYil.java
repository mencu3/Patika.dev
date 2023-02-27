import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int artikYil;
        System.out.print("Yıl giriniz:");
        artikYil = input.nextInt();
        if (artikYil % 4 == 0){
            System.out.println(artikYil + " Artık yıldır!");
        } else {
            System.out.println(artikYil + " Artık yıl değildir!!!!!!");
        }
    }
}
