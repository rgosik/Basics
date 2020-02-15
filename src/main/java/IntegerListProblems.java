import java.util.Collections;
import java.util.List;

public class IntegerListProblems {

    private final List<Integer> list;

    public IntegerListProblems(List<Integer> list) {
        this.list = List.copyOf(list);
    }

    public List<Integer> getList() {
        return list;
    }

    public void sort(){
        Collections.sort(list);
    }

    public double getMedian(){
        int middle = list.size()/2;

        if(list.size() % 2 == 1) {
            return list.get(middle);
        } else {
            return(list.get(middle-1) + list.get(middle)) / 2.0;
        }
    }

    public void getPrimeNumbers() {
        int flag = 0;

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
                System.out.println(el);
            } else {
                flag = 0;
            }
        }
    }

}
