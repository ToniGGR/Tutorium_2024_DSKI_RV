package Übung1;

import java.util.Arrays;

public class DiceGame {
    public static void main(String[] args) {
        int[] diceValues = shuffleDice();
        System.out.println("Shuffled Dice Values: " + Arrays.toString(diceValues));

        boolean homogeneous = isHomogeneous(diceValues);
        System.out.println("Are all values homogeneous? " + homogeneous);

        int[] occurrences = occurrences(diceValues);
        System.out.println("Occurrences of each value: " + Arrays.toString(occurrences));

        boolean fullHouse = isFullHouse(diceValues);
        System.out.println("Is it a full house? " + fullHouse);
    }

    public static int[] shuffleDice() {
        int[] diceValues = new int[5];
        for (int i = 0; i < 5; i++) {
            diceValues[i] = (int) (Math.random() * 6) + 1;
        }
        return diceValues;
    }

    public static boolean isHomogeneous(int[] values) {
        int firstValue = values[0];
        for (int value : values) {
            if (value != firstValue) {
                return false;
            }
        }
        return true;
    }

    public static int[] occurrences(int[] values) {
        int[] occurrences = new int[6];
        int i = 0;

        while (i < values.length) {
            int value = values[i];
            occurrences[value - 1]++;
            i++;
        }

        return occurrences;
    }

    public static boolean isFullHouse(int[] values) {
        int[] occurrences = occurrences(values);
        boolean threeOfAKind = false;
        boolean twoOfAKind = false;

        for (int count : occurrences) {
            if (count == 3) {
                threeOfAKind = true;
            } else if (count == 2) {
                twoOfAKind = true;
            }
        }

        return threeOfAKind && twoOfAKind;
    }



}
