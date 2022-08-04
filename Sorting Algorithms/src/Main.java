public class Main {
    public static void main(String[] args) {
        int[] a = {20, -39, 34, 56, 55, 1, -22, 35};
        BubbleSort ob = new BubbleSort();
        ob.bubbleSort(a);
    }

    public void swap(int[] a, int i, int j) {
        if (i == j)
            return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}