public class SelectionSort {
    public void selectionSort(int[] a) {
        Main obj = new Main();
        for (int i = a.length - 1; i >= 0; i--) {
            int assumed_largest = a[i];
            int largest_index = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > assumed_largest) {
                    largest_index = j;
                }
            }
            obj.swap(a, largest_index, i);
        }
        obj.print(a);
    }
}
