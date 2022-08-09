package com.akshatk1.SortingAlgorithms;

public class CycleSort {
    // WHEN GIVEN RANGE FROM 1-N, USE CYCLIC SORT
    Main obj = new Main();
    public void cyclesort()
    {
        int count = 0;
        int[] a = {3,5,2,1,4};
        int i = 0;
        while(i<a.length)
        {
            count++;
            int correct = a[i]-1;
            if(a[i]!=a[correct])
                obj.swap(a, i, correct);
            else
                i++;
        }
        System.out.println("COUNT = " + count);
        obj.print(a);
    }
}
