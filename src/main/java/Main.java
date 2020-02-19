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

        String str = "geabc";
        String str2 = "  123  -  323- 423-32  11-86     - 555 ";

        IntegerListProblems numP = new IntegerListProblems(list);
        IntegerArrayProblems numP2 = new IntegerArrayProblems(arr);
        StringProblems strProblems = new StringProblems();

        numP.getPrimeNumbers();
        System.out.println(numP.getMedian());

        System.out.println();

        numP2.getPrimeNumbers();
        numP2.bubleSort();
        numP2.printArray();
        System.out.println(numP2.getMedian());

        System.out.println(strProblems.task1(str));
        System.out.println(strProblems.task2(str2));

    }
}
