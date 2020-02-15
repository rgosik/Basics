import java.util.Collection;
import java.util.Collections;

public class IntegerArrayProblems {

    private final int[] arr;

    public int[] getArr() {
        return arr;
    }

    public IntegerArrayProblems(int[] arr) {
        this.arr = arr.clone();
    }

    // Arrays.sort(arr) uses Dual-Pivot implementation of Quicksort
    public void bubleSort() {

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void getMedian() {
        double median;
        bubleSort();
        
        if(arr.length % 2 == 0 ) {
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
        } else {
            median = arr[arr.length/2];
        }

        System.out.println(median);
    }

    public void getPrimeNumbers() {
        int flag = 0;

        for(int el: arr) {
            if(el <= 1){
                continue;
            }

            for(int i = 2; i <= Math.sqrt(el); i++) {
                if (el % i == 0){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0) {
                System.out.println(el);
            } else {
                flag = 0;
            }
        }
    }

    public void printArray()
    {
        for(int item: arr) {
            System.out.print(item +" ");
        }
        System.out.println();
    }
}
