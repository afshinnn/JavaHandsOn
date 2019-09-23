package com.afshin.JavaHandsOn;

import java.util.regex.Pattern;

/**
 * This class includes practices on regular expressions.
 */
public class RegularExpressions {
    private static final Pattern junePattern = Pattern.compile(".*june.*");
    private static final Pattern julyPattern = Pattern.compile(".*july.*");

    public void run() {
        String expr1 = "123june";

        System.out.println(
            junePattern.pattern() + " matches with " + expr1 +" -> " +
                singleMatch(junePattern, expr1)
        );

        System.out.println(
            julyPattern.pattern() + " matches with " + expr1 +" -> " +
                singleMatch(julyPattern, expr1)
        );
    }

    private static boolean singleMatch(Pattern pattern, String stringToMatch) {
        return pattern.matcher(stringToMatch).matches();
    }
}
