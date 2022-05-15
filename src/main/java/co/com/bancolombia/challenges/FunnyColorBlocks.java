package co.com.bancolombia.challenges;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class FunnyColorBlocks {

    public int unblockMe(String[] towers) {
        if (towers.length == 0) {
            return 0;
        }
        Map<String, Integer> colorCount = new TreeMap<>();
        for (String original : towers) {
            sum(colorCount, original);
            char[] current = original.toCharArray();
            if (current[0] != current[1]) {
                String swapUp = current[1] + "" + current[0] + "" + current[2];
                sum(colorCount, swapUp);
            }
            if (current[1] != current[2]) {
                String swapDown = current[0] + "" + current[2] + "" + current[1];
                sum(colorCount, swapDown);
            }
        }
        return colorCount.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getValue();
    }

    private void sum(Map<String, Integer> count, String color) {
        count.compute(color, (key, current) -> current == null ? 1 : current + 1);
    }
}
