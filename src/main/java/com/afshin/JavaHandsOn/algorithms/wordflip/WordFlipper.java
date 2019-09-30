package com.afshin.JavaHandsOn.algorithms.wordflip;

/**
 * Problem: Given a string as the input, write a recursive algorithm to return
 * the reverse of a the input string.
 * Example: Given "Monday" to be the input, then output should be "yadnoM".
 */
public class WordFlipper {

    public static String flip(String text) throws Exception {
        if (text == null || text.length() < 1) {
            throw new Exception("bad input!");
        }

        if (text.length() == 1) {
            return text;
        }

        int midIndex = text.length() / 2;
        return flip(text.substring(midIndex)) + flip(text.substring(0, midIndex));
    }
}
