public class BubbleSort {
    // after each iteration, we find largest element and swap it. After each cycle, we get largest element at the end
    public void bubbleSort(int[] a) {
        Main obj = new Main();
        for (int lastUnsortedIndex = a.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (a[i] > a[i + 1])
                    obj.swap(a, i, i + 1);
            }
        }

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}
