package Bowling;

import java.util.List;

public class Bowling {
    public static Integer scoreGame(List<Integer> rolls) {
        return rolls.stream().mapToInt(Integer::intValue).sum();
    }
}
