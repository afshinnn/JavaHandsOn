package com.afshin.JavaHandsOn;

import java.util.regex.Pattern;

/**
 * This class includes practices on regular expressions.
 */
class RegularExpressions {
    private static final String juneString = ".*june.*";
    private static final String julyString = ".*july.*";

    private static final Pattern junePattern = Pattern.compile(juneString);
    private static final Pattern julyPattern = Pattern.compile(julyString);
    private static final Pattern juneOrJulyPattern = Pattern.compile(juneString + "|" + julyString);

    void run() {
        String expr1 = "123june";

        System.out.println(
            junePattern.pattern() + " matches with " + expr1 +" -> " +
                singleMatch(junePattern, expr1)
        );

        System.out.println(
            julyPattern.pattern() + " matches with " + expr1 +" -> " +
                singleMatch(julyPattern, expr1)
        );

        System.out.println(
            juneOrJulyPattern.pattern() + " matches with " + expr1 +" -> " +
                singleMatch(juneOrJulyPattern, expr1)
        );

    }

    private static boolean singleMatch(Pattern pattern, String stringToMatch) {
        return pattern.matcher(stringToMatch).find();
    }
}
