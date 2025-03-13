package edu.estatuas.brunosbox;

public class ScoreCard {

    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private byte rounds = 0;

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
        return this.rounds;
    }

    @Override
    public String toString() {
        return "\n\t\t\t   " + getScoreCard()
                + "\n\t" + getBCorner()
                + "\t" + getRCorner()
                + "\n\t\t\t" + getRounds() + " rounds\n"
                + "Round\t" + "Score\t" + "Round\t" + "Score\t" + "Round\t\n"
                + "Score\t" + "Total\t" + "\t\t" + "Total\t" + "Score\t";
    }
}
