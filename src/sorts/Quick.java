package sorts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Quick extends Sort{
    public Quick() {
        sortType = "Quick";
    }

    private int[] listToArr(ArrayList<Integer> in) {
        int[] out = new int[in.size()];
        for (int i = 0; i < in.size(); i++)
            out[i] = in.get(i);
        return out;
    }

    @Override
    public int[] sort(int[] unsorted) {
        if (unsorted.length <= 1) return unsorted;

        int pointer = unsorted.length / 2;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < unsorted.length; i++) {
            if (i == pointer) continue;

            if (!compare(unsorted[i], unsorted[pointer]))
                left.add(unsorted[i]);
            else
                right.add(unsorted[i]);
        }

        int[] sorted = new int[unsorted.length];

        int[] leftSorted = sort(listToArr(left));
        int[] rightSorted = sort(listToArr(right));

        System.arraycopy(leftSorted, 0, sorted, 0, leftSorted.length);
        sorted[leftSorted.length] = unsorted[pointer];
        System.arraycopy(rightSorted, 0, sorted, leftSorted.length + 1, rightSorted.length);

        return sorted;
    }
}
