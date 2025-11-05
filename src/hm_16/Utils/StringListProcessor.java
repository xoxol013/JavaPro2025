package hm_16.Utils;

public class StringListProcessor {

    // Couting to uppercase latters in a string
    public static int countUppercase (String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count ++;
            }
        }
        return count;
    }
}
