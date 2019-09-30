package com.afshin.JavaHandsOn.algorithms.wordflip;

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
