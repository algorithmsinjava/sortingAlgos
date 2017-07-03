package com.iamoperand;

/**
 * Created by iamoperand on 3/7/17.
 */
public class QuickSort {


    void quickSort(int a[], int startIndex, int endIndex){

        if(startIndex < endIndex){

            int pivot = partition(a, startIndex, endIndex);
            quickSort(a, startIndex, pivot-1);
            quickSort(a, pivot+1, endIndex);
        }


    }

    int partition(int a[], int startIndex, int endIndex){

        int pivotIndex = startIndex;

        int pivot = a[endIndex];

        for(int i=startIndex; i<endIndex; i++){

            if(a[i] <= pivot){
                int temp = a[pivotIndex];
                a[pivotIndex] = a[i];
                a[i] = temp;
                pivotIndex++;

            }
        }
        int temp = a[pivotIndex];
        a[pivotIndex] = a[endIndex];
        a[endIndex] = temp;
        return pivotIndex;
    }

    void printArray(int a[]) {

        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        QuickSort q = new QuickSort();
        int a[] = {3, 4, 7, 5, 2, 6};

        int n = a.length;
        q.quickSort(a, 0, n-1);
        q.printArray(a);
    }
}
