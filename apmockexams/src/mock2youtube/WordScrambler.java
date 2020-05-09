package mock2youtube;

public class WordScrambler {
    private String[] scrambledWords;
    //public WordScrambler(String[] wordArr) {
    //    scrambledWords = mixedWords(wordArr);
    //}

    // Part A
    private String recombine(String word1, String word2) {
        int len1 = word1.length()/2;
        int len2 = word2.length()/2;

        String combined = word1.substring(0, len1) + word2.substring(len2);
        return combined;
    }

    /* Part B
    public String checkValidLength(String word1, String word2)
    First, initialize an integer i and set it equal to the length of the String returned from the recombine method when word1 and word2 are passed as parameters.
    Then, in an if statement, check if the length variable is less than the length of word1 or word2.
    If it is, than return true.
    Otherwise, return false.
     */
}
