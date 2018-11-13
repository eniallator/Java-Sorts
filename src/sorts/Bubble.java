package sorts;

public class Bubble extends Sort {
    public Bubble() {
        sortType = "Bubble";
    }

    @Override
    public int[] sort(int[] inArray) {
        for (int i = inArray.length - 1; i > 0; i--) {
            boolean sortFlag = true;

            for (int j = 0; j < i; j++) {
                if (compare(inArray[j], inArray[j + 1])) {
                    sortFlag = false;

                    int temp = inArray[j];
                    inArray[j] = inArray[j + 1];
                    inArray[j + 1] = temp;
                }
            }

            if (sortFlag) break;
        }

        return inArray;
    }
}
