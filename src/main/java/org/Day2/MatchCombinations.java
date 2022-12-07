package org.Day2;

import java.util.HashMap;
import java.util.Map;

public class MatchCombinations {



    public static Map<String, Integer> getMatchCombinations() {

        Map<String, Integer> matchCombinations = new HashMap<>();

        // 1 for Rock==X,A
        // 2 for Paper==Y,B
        // 3 for Scissors==Z,C

        // 0 lost
        // 3 draw
        // 6 won
        matchCombinations.put("A X", 4); // Rock Rock - DRAW
        matchCombinations.put("A Y", 8); // Rock Paper - WIN
        matchCombinations.put("A Z", 3); // Rock Scissor - LOST

        matchCombinations.put("B X", 1); // Paper Rock - LOST
        matchCombinations.put("B Y", 5); // Paper Paper - DRAW
        matchCombinations.put("B Z", 9); // Paper Scissor - WIN

        matchCombinations.put("C X", 7); // Scissor Rock - WIN
        matchCombinations.put("C Y", 2); // Scissor Paper - LOST
        matchCombinations.put("C Z", 6); // Scissor Scissor - DRAW

        return matchCombinations;
    }

    public static Map<String, Integer> getMatchCombo2() {

        Map<String, Integer> matchCombinations = new HashMap<>();

        /**
         *  X lose - ROCK   - 1
         *  Y draw - PAPER  - 2
         *  Z win - SCISSOR - 3
         */
        /**
         * 0 - LOST
         * 3 - DRAW
         * 6 - WIN
         */
        /**
         * 1 - ROCK
         * 2 - PAPER
         * 3 - SCISSOR
         */
        matchCombinations.put("A X", 3); // LOSE - Rock Scissor
        matchCombinations.put("A Y", 4); // DRAW - Rock Rock
        matchCombinations.put("A Z", 8); // WIN -  Rock Paper

        matchCombinations.put("B X", 1); // Paper Rock - LOST
        matchCombinations.put("B Y", 5); // Paper Paper - DRAW
        matchCombinations.put("B Z", 9); // Paper Scissor - WIN

        matchCombinations.put("C X", 2); // LOSE - Scissor Paper
        matchCombinations.put("C Y", 6); // DRAW - Scissor Scissor
        matchCombinations.put("C Z", 7); // WIN - Scissor Rock

        return matchCombinations;
    }
}
