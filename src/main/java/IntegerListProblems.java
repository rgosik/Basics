import java.util.ArrayList;
import java.util.List;

public class IntegerListProblems {

    public IntegerListProblems() {}

    public double getMedian(List<Integer> list){
        int middle = list.size()/2;

        if(list.size() % 2 == 1) {
            return list.get(middle);
        } else {
            return(list.get(middle-1) + list.get(middle)) / 2.0;
        }
    }

    public List<Integer> getPrimeNumbers(List<Integer> list) {
        int flag = 0;
        List<Integer> newList = new ArrayList<>();

        for(int el: list) {

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
                newList.add(el);
            } else {
                flag = 0;
            }
        }

        return newList;
    }

}
