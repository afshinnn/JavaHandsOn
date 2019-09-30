package com.afshin.JavaHandsOn;

import com.afshin.JavaHandsOn.algorithms.wordflip.WordFlipper;
import com.afshin.JavaHandsOn.comparison.ComparatorExample;
import com.afshin.JavaHandsOn.regularexpression.RegularExpressions;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaHandsOnApplication {

    public static void main(String[] args) {

        System.out.println("--- RegularExpressions ---");
        new RegularExpressions().run();

        System.out.println("\n--- Comparator ---");
        new ComparatorExample().run();

        System.out.println("\n--- Word Flip");

        try {
            System.out.println(
                WordFlipper.flip("Hello from Afshin")
            );
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
