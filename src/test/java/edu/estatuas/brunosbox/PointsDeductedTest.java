package edu.estatuas.brunosbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointsDeductedTest {

    @Test
    public void replaceTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals("10 - 8", round.getRedBoxerScore() + " - " + round.getBlueBoxerScore());
        round = new PointsDeducted("1, 8 - 10");
        assertEquals("8 - 10", round.getRedBoxerScore() + " - " + round.getBlueBoxerScore());
    }

    @Test
    public void roundScoreToIntBlueTest() {
        PointsDeducted round = new PointsDeducted("10 - 8 ,1");
        assertEquals("10 - 8", round.getRedBoxerScore() + " - " + round.getBlueBoxerScore());
        assertEquals(10, round.getRedBoxerScore());
        assertEquals(8, round.getBlueBoxerScore());
    }

    @Test
    public void roundScoreToIntRedTest() {
        PointsDeducted round = new PointsDeducted("1, 8 - 10");
        assertEquals("8 - 10", round.getRedBoxerScore() + " - " + round.getBlueBoxerScore());
        assertEquals(8, round.getRedBoxerScore());
        assertEquals(10, round.getBlueBoxerScore());
    }

}
