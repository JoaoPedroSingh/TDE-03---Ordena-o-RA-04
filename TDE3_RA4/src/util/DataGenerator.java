package util;

import java.util.Random;

public class DataGenerator {
    public static int[] generate(int size, int seed) {
        int[] data = new int[size];
        Random rand = new Random(seed);
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(1_000_000);
        }
        return data;
    }
}