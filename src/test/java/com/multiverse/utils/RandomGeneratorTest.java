package com.multiverse.utils;


import org.junit.Test;

import java.util.List;

public class RandomGeneratorTest {

    @Test
    public void randomGeneratorTest() {
        com.multiverse.utils.RandomGenerator randomGenerator = new com.multiverse.utils.RandomGenerator();
        List<Integer> result = randomGenerator.generateRandomNumbers(10, Integer.class);
        System.out.println(result);
    }
}
