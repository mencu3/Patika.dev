import java.util.Scanner;

public class ListeSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Liste kaç elemanlı olsun: ");
        int n = input.nextInt();

        int[] list = new int[n];
        System.out.println("Listenin elemanlarını giriniz:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Eleman: ");
            list[i] = input.nextInt();
        }

        // Sorting the array in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        // Displaying the sorted array
        System.out.print("Ranking: ");
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
