import java.util.Collection;
import java.util.Collections;

public class IntegerArrayProblems {


    public IntegerArrayProblems(){}

    // Arrays.sort(arr) uses Dual-Pivot implementation of Quicksort
    public int[] bubleSort(int[] arr) {

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

        return arr;
    }

    public double getMedian(int[] arr) {
        double median;
        bubleSort(arr);
        
        if(arr.length % 2 == 0 ) {
            median = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2;
        } else {
            median = arr[arr.length/2];
        }

        return median;
    }

    public int[] getPrimeNumbers(int[] arr) {
        int flag = 0;
        int[] primeNumbers = {};

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
                primeNumbers = addElement(primeNumbers, el);
            } else {
                flag = 0;
            }
        }

        return primeNumbers;
    }

    public int[] addElement(int[] arr, int x) {
        int[] newArr = new int[arr.length +1];

        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = x;

        return newArr;
    }

    public int[] deleteDuplicates(int[] arr) {

        bubleSort(arr);
        for(int i = 0; i < arr.length; i++){
            if(i != 0 && arr[i] == arr[i-1]){
                arr = removeElement(arr,i);
                i--;
            }
        }

        return arr;
    }

    public int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];

        if (index < 0 || index >= arr.length) {
            return arr;
        }

        for(int i = 0, k = 0; i < arr.length; i++) {
            if(i == index) {
                continue;
            }
            newArr[k++] = arr[i];
        }

        return newArr;
    }

    public void printArray(int[] arr) {

        for(int item: arr) {
            System.out.print(item +" ");
        }
        System.out.println();
    }
}
