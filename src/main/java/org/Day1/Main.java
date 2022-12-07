package org.Day1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Function!");
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
        String expectedData = "Hello, world!";

        Path path = Paths.get(Main.class.getClassLoader()
                .getResource("Day1File.txt").toURI());

        Stream<String> lines = Files.lines(path);
        List<String> collect = lines.collect(Collectors.toList());
        int highest = 0;
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
                intermediateScore = 0;
            }

            if (runningSize == size && intermediateScore > highest) {
                highest = intermediateScore;
            }

            runningSize++;
        }
        System.out.println("Highest" + highest);
        System.out.println(size);
        lines.close();

    }
}