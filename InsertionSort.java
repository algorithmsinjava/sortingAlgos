package com.iamoperand;

/**
 * Created by iamoperand on 28/6/17.
 */
public class InsertionSort {

    void insertionSort(int arr[]){

        int n = arr.length;


        for(int i=1; i<n; i++){

            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    void printArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        InsertionSort i = new InsertionSort();
        int[] arr = {5,1,99,2,81,77};
        i.insertionSort(arr);
        System.out.println("The sorted array is: ");
        i.printArray(arr);
    }

}
