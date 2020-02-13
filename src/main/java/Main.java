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

        IntegerProblems numP = new IntegerProblems(list);

        numP.getPrimeNumbers();

    }
}
