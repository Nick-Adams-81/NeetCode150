package TwoPointers;

import java.util.Locale;

public class ValidPalindrome {

    public boolean removeChars(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        String result = "";
        for(char c : str.toCharArray()) {
            result += c;
        }

        int aPointer = 0;
        int bPointer = result.length() -1;
        while(aPointer <= bPointer) {
            if(result.charAt(aPointer) != result.charAt(bPointer)) return false;
            aPointer++;
            bPointer--;
        }
        return true;

    }

}
