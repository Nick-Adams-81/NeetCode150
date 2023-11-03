import Arrays.TwoSum;
import Arrays.ValidAnagram;
import SlidingWindow.BuyAndSellStock;
import TwoPointers.ContainerWithMostWater;
import TwoPointers.TrappingRainWater;
import TwoPointers.TwoSum2;
import TwoPointers.ValidPalindrome;
import Arrays.ContainsDuplicate;
import Arrays.GroupAnagrams;
import Arrays.TopKFrequentElements;
import Arrays.ValidSudoku;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ContainsDuplicate duplicate = new ContainsDuplicate();
        int[] myNums = {1, 2, 3};
        System.out.println(duplicate.containsDuplicate(myNums));

        TwoSum twoSum = new TwoSum();
        int[] moreNums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum.twoSum(moreNums, 9)));
        System.out.println(Arrays.toString(twoSum.twoSumNSquared(moreNums, 18)));

        GroupAnagrams anagrams = new GroupAnagrams();
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(anagrams.groupAnagrams(strings));

        TopKFrequentElements frequentElements = new TopKFrequentElements();
        int[] kNums = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(frequentElements.topKElements(kNums, 2)));


        ValidAnagram anagram = new ValidAnagram();
        System.out.println(anagram.isAnagram1("cat", "taco"));

        String str = "a man, a plan, a Canal, Panama!!! 123";
        ValidPalindrome palindorme = new ValidPalindrome();
        System.out.println(palindorme.removeChars(str));

        TwoSum2 twoSum2 = new TwoSum2();
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum2.twoSum2(numbers, 9)));

        BuyAndSellStock maxProfit = new BuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit.maxProfit(prices));

        ContainerWithMostWater water = new ContainerWithMostWater();

        int[] aqua = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(water.maxArea(aqua));

        TrappingRainWater rainWater = new TrappingRainWater();
        int[] moreAqua = {4, 2, 0, 3, 2, 5};
        System.out.println(rainWater.trap(moreAqua));

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        ValidSudoku sudoku = new ValidSudoku();
        System.out.println(sudoku.isValidSudoku(board));
    }
}
