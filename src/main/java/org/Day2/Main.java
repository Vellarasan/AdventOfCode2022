package org.Day2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private static final int ROCK_SCORE = 1;
    private static final int PAPER_SCORE = 2;
    private static final int SCISSORS_SCORE = 3;

    private static final int WIN = 6;
    private static final int DRAW = 3;
    private static final int LOST = 0;


    public static void main(String[] args) {

        System.out.println("reading the file");
        try {
            Main.readFile();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFile() throws URISyntaxException, IOException {

        Path path = Paths.get(Main.class.getClassLoader()
                .getResource("Day2File.txt").toURI());

        Stream<String> lines = Files.lines(path);
        List<String> collect = lines.collect(Collectors.toList());

        int totalSum =
                collect.stream()
                .map(eachMatch -> MatchCombinations.getMatchCombinations().get(eachMatch))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(totalSum);

        int secondSum =
                collect.stream()
                        .map(eachMatch -> MatchCombinations.getMatchCombo2().get(eachMatch))
                        .mapToInt(Integer::intValue)
                        .sum();
        System.out.println("Second Sum" + secondSum);
    }
}