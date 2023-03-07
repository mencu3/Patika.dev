import java.util.Scanner;

public class PalindromKelime {
    public static void main(String[] args) {
        System.out.println("Çıkman için 'çıkış' yazınız.");
        while (true) {
            String reverese = "";
            System.out.print("kelime girin : ");
            Scanner inp = new Scanner(System.in);
            String word = inp.nextLine();
            if (word.equals("çıkış")){
                break;
            }
            for (int i = word.length() - 1; i >= 0; i--) {
                reverese += word.charAt(i);
            }
            System.out.print("sonuç : ");
            if (word.equals(reverese)) {
                System.out.println("palindrom  ");
            } else {
                System.out.println("palindrom degil ");
            }

        }
    }
}
