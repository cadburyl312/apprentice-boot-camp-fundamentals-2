package Bowling;

import java.util.List;

public class Bowling {
    public static Integer scoreGame(List<Integer> rolls) {
        int total = 0;
        for (int i = 0; i < rolls.size(); i+=2) {
            if (rolls.get(i) == 10) {
                total += 10 + rolls.get(i + 1) + rolls.get(i + 2);
                i -= 1;
                continue;
            }
            int frameScore;
            frameScore = rolls.get(i) + rolls.get(i + 1);
            if (frameScore == 10) {
                frameScore += rolls.get(i + 2);
            }
            total += frameScore;
        }
        return total;
    }
}
