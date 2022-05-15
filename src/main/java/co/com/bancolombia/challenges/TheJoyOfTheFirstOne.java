package co.com.bancolombia.challenges;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class TheJoyOfTheFirstOne {

    public int[] letsGoParty(int[] bigArray, int resultSize) {
        Map<Integer, Boolean> current = new TreeMap<>();
        PriorityQueue<Integer> finalRes = new PriorityQueue<>();
        PriorityQueue<Integer> comp = new PriorityQueue<>(1, Comparator.reverseOrder());
        for (int val : bigArray) {
            if (current.size() < resultSize) {
                current.put(val, true);
                comp.add(val);
                finalRes.add(val);
            } else if (comp.isEmpty() || comp.peek() > val) {
                comp.add(val);
                current.put(val, true);
                finalRes.add(val);
                current.remove(comp.poll());
            }
        }

        int[] resa = finalRes.stream().mapToInt(x -> x).sorted().toArray();
        int[] res = new int[resultSize];
        System.arraycopy(resa, 0, res, 0, resultSize);
        return res;
    }

    public static void main(String[] args) throws IOException {
        TheJoyOfTheFirstOne joy = new TheJoyOfTheFirstOne();

        Random random = new Random(42);
        final IntStream ints = random.ints(200_000_000, 0, Integer.MAX_VALUE);
        int[] array = ints.toArray();

        long init = System.currentTimeMillis();
        final int[] solution = joy.letsGoParty(array, 50);
        System.out.println("Time: " + (System.currentTimeMillis() - init) + "ms");
        System.out.println("Fin" + solution[0]);
        System.out.println("Fin" + solution[17]);
        System.out.println("Fin" + solution[49]);
        System.out.println("Fin" + solution[40]);
    }

}
