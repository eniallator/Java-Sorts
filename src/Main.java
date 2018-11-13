import sorts.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = {2, 6, 34, 8, 4, 5, 1, 13, 68, 9, 12, 23, 7, 3};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 23, 34, 68};

        Sort[] sorts = new Sort[4];

        sorts[0] = new Bubble();
        sorts[1] = new Insertion();
        sorts[2] = new Merge();
        sorts[3] = new Quick();

        System.out.println("Testing with an array with " + arrayToSort.length + " elements");
        for (Sort type : sorts) {
            type.preSort();
            int[] result = type.sort(arrayToSort);
            boolean correct = Arrays.equals(result, sortedArray);
            System.out.println(type.sortType + ": got the " + (correct ? "right" : "wrong") + " result and performed " + type.comparisons + " comparisons.");
        }
    }
}
