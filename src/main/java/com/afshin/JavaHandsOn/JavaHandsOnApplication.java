package com.afshin.JavaHandsOn;

import com.afshin.JavaHandsOn.comparison.ComparatorExample;
import com.afshin.JavaHandsOn.regularexpression.RegularExpressions;
import jdk.internal.dynalink.linker.ConversionComparator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaHandsOnApplication {

    public static void main(String[] args) {

        System.out.println("--- RegularExpressions ---");
        new RegularExpressions().run();

        System.out.println("\n--- Comparator ---");
        new ComparatorExample().run();
    }

}
