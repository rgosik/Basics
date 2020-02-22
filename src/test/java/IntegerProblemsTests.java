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
    void bubbleSort(){
        int[] arr = {1,5,2,1,7,1,5,66,32,21};

        int[] sortedArr = arrProb.bubleSort(arr);
        Arrays.sort(arr);

        assertArrayEquals(sortedArr, arr);
    }

    @Test
    void deleteDuplicate(){
        int[] arr = {1,2,2,2,2,2,3,7,1,8,1,8,5};

        int[] delArr = arrProb.deleteDuplicates(arr);
        arrProb.printArray(delArr);

        assertArrayEquals(delArr, new int[] {1,2,3,5,7,8});
    }

    @Test
    void getPrimeNumbers(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,-2,0,-111,2741,3253,9291};

        int[] primeArr = arrProb.getPrimeNumbers(arr);

        assertArrayEquals(primeArr, new int[] {2,3,5,7,11,13,2741,3253});
    }
}
