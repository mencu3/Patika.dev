import java.util.Scanner;

public class RecursiveUsluSayi {
    static int findPow(int base,int exponent){
        if (base == 1 || exponent ==0){
            return 1;
        }
        return base * findPow(base,exponent-1);
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter base number:");
        int base= scan.nextInt();
        System.out.print("Please enter exponent number:");
        int exponent=scan.nextInt();
        int result=findPow(base,exponent);
        System.out.println(result);
    }

    }

