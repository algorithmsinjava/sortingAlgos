package com.iamoperand;

/**
 * Created by iamoperand on 3/7/17.
 */
public class RandomisedQuickSort {

    void quickSort(int a[], int startIndex, int endIndex){

        if(startIndex < endIndex){

            int pivotIndex = randomisedPartition(a, startIndex, endIndex);
            quickSort(a, startIndex, pivotIndex-1);
            quickSort(a, pivotIndex+1, endIndex);
        }


    }

    int randomisedPartition(int a[], int startIndex, int endIndex){

        int pivotIndex = (int) (startIndex + (Math.random()*10)%((endIndex-startIndex)+1));

        int temp = a[endIndex];
        a[endIndex] = a[pivotIndex];
        a[pivotIndex] = temp;

        int returnedPivotIndex = partition(a, startIndex, endIndex);
        return returnedPivotIndex;
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
        RandomisedQuickSort rq = new RandomisedQuickSort();
        int a[] = {3, 4, 7, 5, 2, 1};

        int n = a.length;
        rq.quickSort(a, 0, n-1);
        rq.printArray(a);
    }
}
