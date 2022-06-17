package com.clean.guess;

public class GuessStatisticsMessage {
    public String make(char candidate, int count) {
        return String.format("There %s %s %s%s",
                getVerb(count),
                getNumber(count),
                candidate,
                getPluralModifier(count));
    }

    private String getVerb(int count) {
        return count == 1 ? "is" : "are";
    }

    private String getNumber(int count) {
        return count == 0 ? "no" : Integer.toString(count);
    }

    private String getPluralModifier(int count) {
        return count == 1 ? "" : "s";
    }

    // C., Martin Robert. Clean Code (pp. 84-85). Pearson Education. Kindle Edition.
    // Refactoring by me
}
