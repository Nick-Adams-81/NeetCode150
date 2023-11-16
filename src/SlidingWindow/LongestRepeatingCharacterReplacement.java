package SlidingWindow;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] chars = new int[26];
        int start = 0;
        int maxLength = 0;
        int maxCount = 0;
        for(int close = 0; close < n; close++) {
            chars[s.charAt(close) - 'A']++;
            maxCount = Math.max(maxCount, chars[s.charAt(close) - 'A']);
            while(close - start - maxCount + 1 > k) {
                chars[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, close - start +1);
        }
        return maxLength;
    }
}
