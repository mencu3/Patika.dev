import java.util.Arrays;

public class TekrarEdenSayi {
    public static void main(String[] args) {
        int[] arr= {0,0,0,0,0,0,1,2,2,2,1,4,5,6,7,8,8};

        Arrays.sort(arr);

        int sayac=1;

        for(int i=0; i< arr.length; i++) {

            if(i==0) {
                for( int j=0; j<arr.length; j++) {
                    if ((i != j) && arr[i] == arr[j]) {

                        sayac++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar etmiştir.");
            }else if (arr[i] != arr[i-1]) {
                for (int j=0; j< arr.length; j++) {
                    if ((i != j) && (arr[i] == arr[j])) {
                        sayac++;
                    }
                }
                System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar etmiştir.");
            }
            sayac=1;
        }
    }
    }

