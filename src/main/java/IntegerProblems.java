import java.util.ArrayList;
import java.util.List;

public class IntegerProblems {
    int[] arr;
    List<Integer> list;

    public IntegerProblems(int[] arr) {
        this.arr = arr.clone();
    }

    public IntegerProblems(List<Integer> list) {
        this.list = new ArrayList<Integer>();
        this.list = List.copyOf(list);
    }

    public void getPrimeNumbers(int[] arr){

    }

    public void getPrimeNumbers(){
        int flag = 0;

        for(int el: list){

            if(el <= 1){
                continue;
            }

            for(int i = 2; i <= Math.sqrt(el); i++){
                if(el % i == 0){
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
