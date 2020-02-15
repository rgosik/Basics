import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(11);
        list.add(9);
        list.add(1);
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(20);
        list.add(7);

        int[] arr = {1,2,3,4,5};

        IntegerListProblems numP = new IntegerListProblems(list);
        IntegerArrayProblems numP2 = new IntegerArrayProblems(arr);

        numP.getPrimeNumbers();
        numP.getMedian();

        numP2.getPrimeNumbers();
        numP2.bubleSort();
        numP2.printArray();
        numP2.getMedian();
    }
}
