public class Main {
    public static void main(String[] args) {
        int[] a = {20, -39, 34, 56, 55, 1, -22, 35};
        System.out.println("BUBBLE SORT:");
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(a);
        System.out.println("SELECTION SORT:");
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(a);
        System.out.println("INSERTION SORT:");
        InsertionSort is = new InsertionSort();
        is.insertionSort(a);
    }

    public void swap(int[] a, int i, int j) {
        if (i == j)
            return;
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void print(int[] a) {
        for (int j : a) System.out.println(j);
    }
}