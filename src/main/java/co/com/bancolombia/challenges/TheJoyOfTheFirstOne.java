package co.com.bancolombia.challenges;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.IntStream;

public class TheJoyOfTheFirstOne {

    public int[] letsGoParty(int[] bigArray, int resultSize){
        throw new UnsupportedOperationException();
    }


    public static void main(String[] args) throws IOException {
        TheJoyOfTheFirstOne joy = new TheJoyOfTheFirstOne();

        Random random = new Random(42);
        final IntStream ints = random.ints(200_000_000, 0, Integer.MAX_VALUE);
        int[] array = ints.toArray();

        long init = System.currentTimeMillis();
        final int[] solution = joy.letsGoParty(array, 50);
        System.out.println("Time: " + (System.currentTimeMillis()-init) + "ms");
        System.out.println("Fin");
    }

}
