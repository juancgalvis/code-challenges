package co.com.bancolombia.challenges;

import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class CanYouFindMe {

    public int[] lostAndFound(int[] numbers, int resultSize){
        throw  new UnsupportedOperationException();
    }

    public static void main(String[] args) throws IOException {
        final CanYouFindMe canYouFindMe = new CanYouFindMe();
        Random random = new Random(47);

        final IntStream ints = random.ints(150_000_000, -100_000_000, 150_000_000);
        final int[] array = ints.toArray();

        final long init = System.currentTimeMillis();
        final int[] partialSolution = canYouFindMe.lostAndFound(array, 500);
        final long total = System.currentTimeMillis() - init;
        System.out.println(total+"ms");



    }
}
