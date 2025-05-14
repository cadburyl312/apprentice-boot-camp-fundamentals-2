package Bowling;

import java.util.List;

public class Bowling {
    public static Integer scoreGame(List<Integer> rolls) {
        int score = 0;
        int frameCount = 0;
        for (int i = 0; i < rolls.size(); i+=2) {
            if (rolls.get(i) == 10) {
                score += 10 + rolls.get(i + 1) + rolls.get(i + 2);
                i -= 1;
                frameCount ++;
                if (frameCount == 10) {break;}
                continue;
            }
            int frameScore;
            frameScore = rolls.get(i) + rolls.get(i + 1);
            if (frameScore == 10) {
                frameScore += rolls.get(i + 2);
                if (frameCount == 10) {break;}
            }
            score += frameScore;
            frameCount ++;
        }
        return score;
    }
}
