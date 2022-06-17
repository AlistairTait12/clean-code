package com.clean;

import com.clean.guess.*;

public class Main {

    public static void main(String[] args) {
        GuessStatisticsMessage myGuessStatisticsMessage = new GuessStatisticsMessage();

        String myGuess = myGuessStatisticsMessage.make('F', 0);

        System.out.println(myGuess);
    }
}
