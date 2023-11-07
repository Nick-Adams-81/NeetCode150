package TwoPointers;

import java.util.Locale;

public class ValidPalindrome {

    public boolean removeChars(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);


        int aPointer = 0;
        int bPointer = str.length() -1;
        while(aPointer <= bPointer) {
            if(str.charAt(aPointer) != str.charAt(bPointer)) return false;
            aPointer++;
            bPointer--;
        }
        return true;

    }

    public boolean isPalindromeOptimized(String s) {
        if(s.isEmpty()) return true;
        int left = 0;
        int right = s.length() -1;
        while(left <= right) {
            char currentFirst = s.charAt(left);
            char currentLast = s.charAt(right);
            if(!Character.isLetterOrDigit(currentFirst)) {
                left++;
            } else if(!Character.isLetterOrDigit(currentLast)) {
                right--;
            } else {
                if(Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)) return false;
                left++;
                right--;
            }

        }
        return true;
    }

}
