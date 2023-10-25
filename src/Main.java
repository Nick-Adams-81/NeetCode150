import Arrays.ContinsDuplicate;
import Arrays.TwoSum;
import Arrays.ValidAnagram;
import TwoPointers.TwoSum2;
import TwoPointers.ValidPalindrome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ContinsDuplicate duplicate = new ContinsDuplicate();
        int[] myNums = {1, 2, 3};
        System.out.println(duplicate.containsDuplicate(myNums));

        TwoSum twoSum = new TwoSum();
        int[] moreNums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum(moreNums, 17)));

        ValidAnagram anagram = new ValidAnagram();
        System.out.println(anagram.isAnagram1("cat", "taco"));

        String str = "a man, a plan, a Canal, Panama!!! 123";
        ValidPalindrome palindorme = new ValidPalindrome();
        System.out.println(palindorme.removeChars(str));

        TwoSum2 twoSum2 = new TwoSum2();
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum2.twoSum2(numbers, 9)));
    }
}
