package Bowling;

import java.util.List;

public class Bowling {
    public static Integer scoreGame(List<Integer> rolls) {
        int score = 0;
        int i = 0;
        for (int frameCount = 0; frameCount < 10; frameCount+=1) {
            if (rolls.get(i) == 10) {
                score += 10 + rolls.get(i + 1) + rolls.get(i + 2);
                i ++;
            }
            else {
                int frameScore;
                frameScore = rolls.get(i) + rolls.get(i + 1);

                if (frameScore == 10) {
                    frameScore += rolls.get(i + 2);
                }
                score += frameScore;
                i += 2;
            }
        }
        return score;
    }
}
