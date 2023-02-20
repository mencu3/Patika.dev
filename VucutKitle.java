import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        int kg;
        double endeks,boy;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kg = inp.nextInt();

        endeks = (kg / (boy * boy));

        System.out.print("Vücut kitle endeksiniz:" +endeks);





    }
}
