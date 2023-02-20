import java.util.Scanner;
public class DarieAlani {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire yarıçapını giriniz : ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

        int a;
        System.out.print("Merkez açı ölçüsünü giriniz : ");
        a = input.nextInt();

        double dilimAlani = (pi * (r*r) * a)/360 ;
        System.out.println("Merkez Açı Alanı : " + dilimAlani);

    }
}
