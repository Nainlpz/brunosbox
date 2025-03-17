package edu.estatuas.brunosbox;

public class ScoreCard {

    private final String color;
    private String redCorner;
    private String blueCorner;
    private byte rounds = 0;
    private String[] judgeScoreCard = new String[0];
    private byte redBoxerFinalScore = 0;
    private byte blueBoxerFinalScore = 0;

    public ScoreCard(String color) {
        this.color = color;
    }

    public String getScoreCard() {
        return this.color;
    }

    public void setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public String getRCorner() {
        return this.redCorner;
    }

    public void setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public String getBCorner() {
        return this.blueCorner;
    }

    public void setRounds(byte rounds) {
        this.rounds = rounds;
    }

    public byte getRounds() {
        setRounds((byte) judgeScoreCard.length);
        return this.rounds;
    }

    public void loadJudgeScoreCard(String[] judgeScoreCard) {
        this.judgeScoreCard = judgeScoreCard;
    }

    public byte getRedBoxerFinalScore() {

        for (String score : judgeScoreCard) {
            RegularRound round = new RegularRound(score);
            redBoxerFinalScore += round.getRedBoxerScore();
        }
        return redBoxerFinalScore;
    }

    public byte getBlueBoxerFinalScore() {

        for (String score : judgeScoreCard) {
            RegularRound round = new RegularRound(score);
            blueBoxerFinalScore += round.getBlueBoxerScore();
        }
        return blueBoxerFinalScore;
    }

    @Override
    public String toString() {
        return "\n\t\t\t   " + getScoreCard()
                + "\n\t" + getBCorner()
                + "\t" + getRCorner()
                + "\n\t\t\t" + getRounds() + " rounds\n"
                + "Round\t" + "Score\t" + "Round\t" + "Score\t" + "Round\t\n"
                + "Score\t" + "Total\t" + "\t\t" + "Total\t" + "Score\t\n"
                + viewRounds() + "\n"
                + "FINAL SCORE " + getBlueBoxerFinalScore() + " - " + getRedBoxerFinalScore() + " FINAL SCORE";
    }

    public String viewRounds() {
        StringBuilder scoreRounds = new StringBuilder();
        setRounds((byte) 0);
        for (String score : judgeScoreCard) {
        RegularRound round = new RegularRound(score);
        rounds++;
            scoreRounds.append(round.getRedBoxerScore()).append("\t".repeat(4))
                    .append(rounds).append("\t".repeat(4))
                    .append(round.getBlueBoxerScore()).append("\n");
        }

        return scoreRounds.toString();
}}
