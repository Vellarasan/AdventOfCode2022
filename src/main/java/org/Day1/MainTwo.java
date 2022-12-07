package org.Day1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTwo {
    public static void main(String[] args) {
        System.out.println("Hello Function!");
        System.out.println("reading the file");
        try {
            MainTwo.readFile();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFile() throws URISyntaxException, IOException {
        String expectedData = "Hello, world!";

        Path path = Paths.get(MainTwo.class.getClassLoader()
                .getResource("Day1File.txt").toURI());

        Stream<String> lines = Files.lines(path);
        List<String> collect = lines.collect(Collectors.toList());
        int highest = 0;
        List<Integer> listOfTotals = new ArrayList<>();
        int intermediateScore = 0;
        int size = collect.size();
        int runningSize = 1;
        for (String eachLine : collect) {
            if (!eachLine.equals("") && runningSize <= size) {
                intermediateScore += Integer.valueOf(eachLine);
            } else {
                System.out.println("Intermediate Score : " + intermediateScore);
                if (intermediateScore > highest) {
                    highest = intermediateScore;
                }
                listOfTotals.add(intermediateScore);
                intermediateScore = 0;
            }

            if (runningSize == size && intermediateScore > highest) {
                highest = intermediateScore;
            }

            runningSize++;
        }

        Collections.sort(listOfTotals);
        Collections.reverse(listOfTotals);
        System.out.println(listOfTotals.get(0));
        System.out.println(listOfTotals.get(1));
        System.out.println(listOfTotals.get(2));
        int topThreeNumber =  listOfTotals.get(0) + listOfTotals.get(1) + listOfTotals.get(2);
        System.out.println("Highest" + highest);
        System.out.println("Top 3 Highest Total " + topThreeNumber);
        //System.out.println(size);
        lines.close();

    }
}