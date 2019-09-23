package com.afshin.JavaHandsOn;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaHandsOnApplication {

    public static void main(String[] args) {
        RegularExpressions regularExpressions = new RegularExpressions();
        regularExpressions.run();
    }

}
