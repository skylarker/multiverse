package com.multiverse.utils;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    public RandomGenerator() {
    }

    public <T> List<T> generateRandomNumbers(int limit, Class<T> type) {
        System.out.println(type);
        Random random = new Random();
        List<T> randomNumbers = new ArrayList<>();
        for(int i=0; i<limit; i++) {
            System.out.println(random.nextInt());
            randomNumbers.add(type.cast(random.nextInt()));
        }
        return randomNumbers;
    }

    public static void main(String... args) {
        RandomGenerator randomGenerator = new RandomGenerator();
        randomGenerator.generateRandomNumbers(5, Integer.class);
    }
}