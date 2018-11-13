package sorts;

public abstract class Sort {
    public int comparisons;
    public String sortType;

    boolean compare(int a, int b) {
        comparisons ++;
        return a > b;
    }

    public void preSort() { comparisons = 0; }
    public int[] sort(int[] unsorted) { return null; }
}
