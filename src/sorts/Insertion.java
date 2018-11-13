package sorts;

public class Insertion extends Sort {
    public Insertion() {
        sortType = "Insertion";
    }

    private int swap(int[] arr, int oldVal, int index) {
        int newVal = arr[index];
        arr[index] = oldVal;
        return newVal;
    }

    @Override
    public int[] sort(int[] inArray) {
        for (int i = 1; i < inArray.length; i++) {
            int lastVal = inArray[i];
            boolean swapping = false;

            for (int j = 0; j <= i; j++) {
                if (swapping) {
                    lastVal = this.swap(inArray, lastVal, j);
                } else {
                    swapping = compare(inArray[j], inArray[i]);
                    if (swapping)
                        lastVal = this.swap(inArray, lastVal, j);
                }
            }
        }

        return inArray;
    }
}
