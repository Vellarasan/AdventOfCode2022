package org.Day4;

import org.Utils.FileUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        List<String> fileContent = FileUtil.getFileContent("Day4File.txt");
        AtomicInteger completeOverLapCounter = new AtomicInteger();
        AtomicInteger counter = new AtomicInteger();


        fileContent.stream().forEach(eachLine -> {
            String[] eachPairs = eachLine.split(",");// 22-77,14-96
            String[] lsPair = eachPairs[0].split("-"); // 22-77
            int lsLow = Integer.valueOf(lsPair[0]);
            int lsHigh = Integer.valueOf(lsPair[1]);

            String[] rsPair = eachPairs[1].split("-"); // 14-96
            int rsLow = Integer.valueOf(rsPair[0]);
            int rsHigh = Integer.valueOf(rsPair[1]);

            // Complete overlap
            if (lsLow <= rsLow && lsHigh >= rsHigh) {
//                System.out.println(lsLow + "<=" + rsLow + " && " + lsHigh + ">=" + rsHigh);
//                System.out.println("Found for " + eachLine);
                completeOverLapCounter.getAndIncrement();
            } else if (rsLow <= lsLow && rsHigh >= lsHigh) {
//                System.out.println("Found for " + eachLine);
                completeOverLapCounter.getAndIncrement();
            } else if (lsHigh >= rsHigh) {
                System.out.println("Found Partials " + eachLine);
                completeOverLapCounter.getAndIncrement();
            } else if (lsLow >= rsLow) {
                completeOverLapCounter.getAndIncrement();
            }

            // PART 2
            Set<String> lsList = new HashSet<>();
            for (int i = lsLow; i <= lsHigh; i++) {
                lsList.add(String.valueOf(i));
            }

            Set<String> rsList = new HashSet<>();
            for (int i = rsLow; i <= rsHigh; i++) {
                rsList.add(String.valueOf(i));
            }

            int lsSize = lsList.size();
            int rsSize = rsList.size();
            int totalSize = lsSize+rsSize;
            lsList.addAll(rsList);
            if (totalSize != lsList.size()) {
                counter.getAndIncrement();
            }
        });

        System.out.println("completeOverLapCounter ==> " + completeOverLapCounter);
        System.out.println("Final Count " + counter);

    }
}