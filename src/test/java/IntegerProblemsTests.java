import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntegerProblemsTests {

    @Test
    void arrayBubbleSort(){
        IntegerArrayProblems arrProb = new IntegerArrayProblems();
        int[] arr = {1,5,2,1,7,1,5,66,32,21};

        int[] sortedArr = arrProb.bubleSort(arr);
        Arrays.sort(arr);

        assertEquals(sortedArr, arr);
    }
}
