package com.iamoperand;

/**
 * Created by iamoperand on 27/6/17.
 */
public class SelectionSort {

    void selectionSort(int arr[]){


        int n = arr.length;
        int min;
        int pos = 0;
        //{5,1,0,2,81,77}
        for(int i=0; i<n; i++){
            min = 9999;
            for(int j=i; j<n; j++){

                if(arr[j] < min){
                    min = arr[j];
                    pos = j;
                    System.out.println("Swapping the value with min at location: " + j);
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[pos] = temp;
            System.out.println("Storing the value at location: " + i);
        }
    }

    void printArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        SelectionSort s = new SelectionSort();
        int[] arr = {5,1,0,2,81,77};
        s.selectionSort(arr);
        System.out.println("The sorted array is: ");
        s.printArray(arr);
    }
}
