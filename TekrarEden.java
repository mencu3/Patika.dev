public class TekrarEden {
    public static void main(String[] args) {
        int[] array = {3,5,7,9,11,11,20,30,40,60,60,50,55,100,100};



        for(int i=0; i<array.length; i++) {

            for(int j=0; j<array.length; j++) {

                if ((i != j) && (array[i]==array[j])) {

                    if(array[i] % 2 == 0) {
                        System.out.println(array[i]);
                        break;
                    }
                }
            }
        }
    }
    }

