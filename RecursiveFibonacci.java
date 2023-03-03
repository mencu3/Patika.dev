import java.util.Scanner;

public class RecursiveFibonacci {
     static int fib(int n){
         if ( n == 1 || n == 2){
             return 1;
         }
         return fib(n-1) + fib(n-2);
     }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için bir sınır sayısı giriniz: ");
        int n = input.nextInt();
        System.out.println(n+" haneli fibonacci serisi: ");
        for(int i=1; i<=n; i++) {
            System.out.print(fib(i)+" ");
        }

    }
}
