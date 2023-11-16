package ArrayMaxAny;
// Поиск заданного количества максимальных значений в массиве

import java.util.Arrays;

public class ArrayMaxAny {

    public static int findMaxUnderBoundary(int[] inputArray, int topBoundary) {
        int currentMax = Integer.MIN_VALUE;
        for(int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < topBoundary) {
                currentMax = Math.max(currentMax, inputArray[i]);
            }
        }
        return currentMax;
    }

    public static int[] findTopElement(int[] inputArray, int numberOfElements) {
        int [] topElements = new int[numberOfElements];

        int previousMax = Integer.MAX_VALUE;

        for(int i = 0; i < numberOfElements; i++) {
            int currentMax = findMaxUnderBoundary(inputArray, previousMax);
            previousMax = currentMax;
            topElements[i] = currentMax;
        }

        return topElements;
    }
    public static void main(String[] args) {
        int[] ages = {10, 6, 15, 93, 42, 7, 32};
        
        int[] top3ages = findTopElement(ages, 3);
        System.out.println(Arrays.toString(top3ages));
    }
}