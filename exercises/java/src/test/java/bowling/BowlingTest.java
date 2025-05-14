package bowling;

import Bowling.Bowling;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BowlingTest {
    @Test
    public void scoreBowlingGame_whenGutterBowlGame_returnZero() {
        List<Integer> zeros = new ArrayList<>(Collections.nCopies(20, 0));

        Integer score = Bowling.scoreGame(zeros);

        assertThat(score).isEqualTo(0);
    }

    @Test
    public void scoreBowlingGame_whenScoringGameNoSpecialRolls() {
        List<Integer> scores = new ArrayList<>(Collections.nCopies(20, 1));

        Integer score = Bowling.scoreGame(scores);

        assertThat(score).isEqualTo(20);
    }
}
