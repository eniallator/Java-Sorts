package sorts;

import java.util.Arrays;

public class Merge extends Sort {
    public Merge() {
        sortType = "Merge";
    }

    @Override
    public int[] sort(int[] unsorted) {
        if (unsorted.length <= 1) return unsorted;

        int midPoint = (int) Math.ceil(unsorted.length / 2.0);

        int[] leftHalf = Arrays.copyOfRange(unsorted, 0, midPoint);
        int[] rightHalf = Arrays.copyOfRange(unsorted, midPoint, unsorted.length);

        int[] leftResult = this.sort(leftHalf);
        int[] rightResult = this.sort(rightHalf);

        int[] sorted = new int[unsorted.length];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < unsorted.length; i++){
            if (rightIndex >= rightResult.length ||
                    leftIndex < leftResult.length &&
                    !compare(leftResult[leftIndex], rightResult[rightIndex])) {

                sorted[i] = leftResult[leftIndex];
                leftIndex++;
            } else {
                sorted[i] = rightResult[rightIndex];
                rightIndex++;
            }
        }

        return sorted;
    }
}
