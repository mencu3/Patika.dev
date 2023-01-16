import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double Armut,Elma,Domates,Muz,Patlican;
        double armF=2.14,elmF=3.67,domF=1.11,muzF=0.95,patF=5;
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut kaç kilo?:");
        Armut = inp.nextDouble();
        Armut += armF;

        System.out.print("Elma kaç kilo?:");
        Elma = inp.nextDouble();
        Elma += elmF;

        System.out.print("Domates kaç kilo?:");
        Domates = inp.nextDouble();
        Domates += domF;

        System.out.print("Muz kaç kilo?:");
        Muz = inp.nextDouble();
        Muz += muzF;

        System.out.print("Patlican kaç kilo?:");
        Patlican = inp.nextDouble();
        Patlican += patF;
        double toplam= Armut + Elma + Domates + Muz + Patlican;
        System.out.print("Toplam tutar:" + toplam);


    }
}
