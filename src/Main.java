public class Main {

    public static void main(String[] args) {

    int[] array1 = range(10, 100, 5);
    turnaround(array1);
    printforward(array1);

    printforward(array1);

    }

    public static int[] range (int start, int end, int step){

        int[] array = new int [(end - start)/step];

        for(int val = start, i = 0; val < end; val +=step, i++ ){

            array [i] = val;
        }
        return array;
    }

    public static void turnaround (int [] array){

        for(int i = array.length-1; i>=0; i--){

            System.out.println(array[i]);
        }


    }

    public static void printforward(int [] array){

        for(int i = 0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
