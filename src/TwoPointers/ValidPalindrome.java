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

}
