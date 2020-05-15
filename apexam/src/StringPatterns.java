import java.util.ArrayList;

public class StringPatterns {

    // Part A
    public static String letterAndPattern(String letter, String pattern) {
        int index = pattern.indexOf(letter);
        if(index != -1) {
            return letter;
        } else {
            String other = "";
            for(int i = 0; i < pattern.length(); i++) {
                other += pattern.substring(pattern.length()-1-i, pattern.length()-i);
            }
            return other;
        }
    }

    /* Part B
    First, a new private int instance variable would be needed, called limit.
    Next, at the beginning of the letterAndPattern method, there would need to be a check implemented using an if statement to check if the length of pattern is greater than the limit.
    If the length of the pattern is greater than the limit, the letterAndPattern method would need to return an empty String.
    In addition, a new public void method, which would accept an int as input, would need to be implemented to set the limit instance variable referenced above.
     */
}
