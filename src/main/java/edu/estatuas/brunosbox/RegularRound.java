package edu.estatuas.brunosbox;

class RegularRound  implements  Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;


    RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.boxerRoundScore();
    }

    String getRoundScore() {
        return this.roundScore;
    }

    void boxerRoundScore() {
        int dashIndex = this.roundScore.indexOf('-');
        this.redBoxerScore = Byte.parseByte(this.roundScore.substring(0, dashIndex));
        this.blueBoxerScore = Byte.parseByte(this.roundScore.substring(dashIndex + 1));
    }

    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }

}