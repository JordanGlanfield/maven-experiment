package org.jordan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello again Java");

        var sum = new SummationProcessor(Arrays.asList(1, 2, 3, 4)).process();

        System.out.printf("The sum is %d%n", sum);

    }
}