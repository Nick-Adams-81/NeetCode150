import Arrays.ContinsDuplicate;
import Arrays.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ContinsDuplicate duplicate = new ContinsDuplicate();
        int[] myNums = {1, 2, 3};
        System.out.println(duplicate.containsDuplicate(myNums));

        TwoSum twoSum = new TwoSum();
        int[] moreNums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum(moreNums, 17)));
    }
}
