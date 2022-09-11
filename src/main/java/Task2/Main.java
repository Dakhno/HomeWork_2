package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 10, 40, 2, 4523, 432, 5, 1, 1, 1};
        firstPair(array, 20);
    }


    public static void firstPair(int[] setNumbers, int sum) {
        int[] pair = new int[2];
        boolean a = false;

        for (int i = 0; i < setNumbers.length - 1; i++) {
            for (int j = i + 1; j < setNumbers.length; j++) {
                if (setNumbers[i] + setNumbers[j] == sum) {
                    pair[0] = setNumbers[i];
                    pair[1] = setNumbers[j];
                    String intArrayString = Arrays.toString(pair);
                    System.out.println(intArrayString);
                    a = true;
                    break;
                }
            }
            if (a == true) break;
        }
        if (a == false) {
            System.out.println("В данном массиве нет такой пары");
        }
    }
}