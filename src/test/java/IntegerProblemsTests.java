import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntegerProblemsTests {

    IntegerArrayProblems arrProb;

    @BeforeEach
    void init(){
        arrProb = new IntegerArrayProblems();
    }

    @Test
    void arrayBubbleSort(){
        int[] arr = {1,5,2,1,7,1,5,66,32,21};

        int[] sortedArr = arrProb.bubleSort(arr);
        Arrays.sort(arr);

        assertArrayEquals(sortedArr, arr);
    }

    @Test
    void deleteDuplicate(){
        int[] arr = {1,2,2,2,2,2,3,7,1,8,1,8,5};

        int[] newArr = arrProb.deleteDuplicates(arr);
        arrProb.printArray(newArr);

        assertArrayEquals(newArr, new int[] {1,2,3,5,7,8});
    }
}
