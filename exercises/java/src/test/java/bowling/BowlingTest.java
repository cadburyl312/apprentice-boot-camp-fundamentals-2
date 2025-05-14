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

    @Test
    public void scoreBowlingGame_whenScoringGameStrike_scoreGameCorrectly() {
        List<Integer> scores =  List.of(10, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Integer score = Bowling.scoreGame(scores);

        assertThat(score).isEqualTo(14);
    }

    @Test
    public void scoreBowlingGame_whenScoringGameWithSpare_scoreGameCorrectly() {
        List<Integer> scores =  List.of(1, 9, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Integer score = Bowling.scoreGame(scores);

        assertThat(score).isEqualTo(12);
    }

    @Test
    public void scoreBowlingGame_whenScoringGameStrikeAndSpare_scoreGameCorrectly() {
        List<Integer> scores =  List.of(10, 9, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Integer score = Bowling.scoreGame(scores);

        assertThat(score).isEqualTo(32);
    }

    @Test
    public void scoreBowlingGame_whenScoringGameAllSpare_scoreGameCorrectly() {
        List<Integer> fives = new ArrayList<>(Collections.nCopies(21, 5));

        Integer score = Bowling.scoreGame(fives);

        assertThat(score).isEqualTo(150);
    }

    @Test
    public void scoreBowlingGame_whenScoringGamePerfectGame() {
        List<Integer> scores = new ArrayList<>(Collections.nCopies(12, 10));

        Integer score = Bowling.scoreGame(scores);

        assertThat(score).isEqualTo(300);
    }
}
