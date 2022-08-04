public class InsertionSort {
    public void insertionSort(int[] a) {
        Main obj = new Main();

        for (int i = 0; i < a.length - 1; i++) {
            while (a[i + 1] < a[i])
                obj.swap(a, i, i + 1);
        }

        obj.print(a);
    }
}
