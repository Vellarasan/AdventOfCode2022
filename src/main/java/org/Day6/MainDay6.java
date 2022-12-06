package org.Day5;

import org.Utils.FileUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

    private static Stack<String> one = new Stack<>();
    private static Stack<String> two = new Stack<>();
    private static Stack<String> three = new Stack<>();
    private static Stack<String> four = new Stack<>();
    private static Stack<String> five = new Stack<>();
    private static Stack<String> six = new Stack<>();
    private static Stack<String> seven = new Stack<>();
    private static Stack<String> eight = new Stack<>();
    private static Stack<String> nine = new Stack<>();

    private static void init() {
        /**
         *                 [M]     [V]     [L]
         * [G]             [V] [C] [G]     [D]
         * [J]             [Q] [W] [Z] [C] [J]
         * [W]         [W] [G] [V] [D] [G] [C]
         * [R]     [G] [N] [B] [D] [C] [M] [W]
         * [F] [M] [H] [C] [S] [T] [N] [N] [N]
         * [T] [W] [N] [R] [F] [R] [B] [J] [P]
         * [Z] [G] [J] [J] [W] [S] [H] [S] [G]
         *  1   2   3   4   5   6   7   8   9
         */


        one.push("Z");
        one.push("T");
        one.push("F");
        one.push("R");
        one.push("W");
        one.push("J");
        one.push("G");

        two.push("G");
        two.push("W");
        two.push("M");

        three.push("J");
        three.push("N");
        three.push("H");
        three.push("G");

        four.push("J");
        four.push("R");
        four.push("C");
        four.push("N");
        four.push("W");

        five.push("W");
        five.push("F");
        five.push("S");
        five.push("B");
        five.push("G");
        five.push("Q");
        five.push("V");
        five.push("M");

        six.push("S");
        six.push("R");
        six.push("T");
        six.push("D");
        six.push("V");
        six.push("W");
        six.push("C");

        seven.push("H");
        seven.push("B");
        seven.push("N");
        seven.push("C");
        seven.push("D");
        seven.push("Z");
        seven.push("G");
        seven.push("V");

        eight.push("S");
        eight.push("J");
        eight.push("N");
        eight.push("M");
        eight.push("G");
        eight.push("C");

        nine.push("G");
        nine.push("P");
        nine.push("N");
        nine.push("W");
        nine.push("C");
        nine.push("J");
        nine.push("D");
        nine.push("L");
    }

    public static void main(String[] args) {

        init();

        List<String> fileContent = FileUtil.getFileContent("Day5File.txt");



        fileContent.stream().forEach(eachLine -> {
            System.out.println("Processing for " + eachLine);
            String[] eachLineArgs = eachLine.split(" ");

            //move 1 from 5 to 2
            int cratesCount = Integer.valueOf(eachLineArgs[1]);
            int sourceStack = Integer.valueOf(eachLineArgs[3]);
            int destinationStackNumber = Integer.valueOf(eachLineArgs[5]);

            switch (sourceStack) {
                case 1:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> temp = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = one.pop();
                           temp.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(temp);
                    temp.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 2:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempTwo = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = two.pop();
                        tempTwo.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempTwo);
                    tempTwo.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 3:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempThree = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = three.pop();
                        tempThree.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempThree);
                    tempThree.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 4:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempFour = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = four.pop();
                        tempFour.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempFour);
                    tempFour.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 5:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempFive = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = five.pop();
                        tempFive.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempFive);
                    tempFive.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 6:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempSix = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = six.pop();
                        tempSix.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempSix);
                    tempSix.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 7:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempSeven = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = seven.pop();
                        tempSeven.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempSeven);
                    tempSeven.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 8:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempEight = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = eight.pop();
                        tempEight.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempEight);
                    tempEight.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
                case 9:
                    // Pop from the source stack for the cratesCount
                    // and push it to the destination stack
                    List<String> tempNine = new ArrayList<>();
                    while (cratesCount > 0) {
                        String popedValue = nine.pop();
                        tempNine.add(popedValue);
                        cratesCount--;
                    }
                    Collections.reverse(tempNine);
                    tempNine.forEach(eachValue -> {
                        putIntoStack(destinationStackNumber, eachValue);
                    });
                    break;
            }
        });
        printTheStack();
        printTheResult();


    }

    private static void printTheStack() {
        System.out.println("ONE => " + one);
        System.out.println("TWO => " + two);
        System.out.println("THREE => " + three);
        System.out.println("FOUR => " + four);
        System.out.println("FIVE => " + five);
        System.out.println("SIX => " + six);
        System.out.println("SEVEN => " + seven);
        System.out.println("EIGHT => " + eight);
        System.out.println("NINE => " + nine);
    }

    private static void printTheResult() {
        String result =
                one.get(one.size()-1) +
                        two.get(two.size()-1) +
                        three.get(three.size()-1) +
                        four.get(four.size()-1) +
                        five.get(five.size()-1) +
                        six.get(six.size()-1) +
                        seven.get(seven.size()-1) +
                        eight.get(eight.size()-1) +
                        nine.get(nine.size()-1);
        System.out.println("Result :::: " + result);


    }

    private static void putIntoStack(int destinationStack, String tempValue) {
        switch (destinationStack) {
            case 1:
                one.push(tempValue);
                break;
            case 2:
                two.push(tempValue);
                break;
            case 3:
                three.push(tempValue);
                break;
            case 4:
                four.push(tempValue);
                break;
            case 5:
                five.push(tempValue);
                break;
            case 6:
                six.push(tempValue);
                break;
            case 7:
                seven.push(tempValue);
                break;
            case 8:
                eight.push(tempValue);
                break;
            case 9:
                nine.push(tempValue);
                break;
        }
    }
}