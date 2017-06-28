package com.iamoperand;

/**
 * Created by iamoperand on 28/6/17.
 */
public class MergeSort {

    void merge(int arr[], int l, int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];

        //Fill in the values into the temporary arrays
        for(int i=0; i<n1; i++){
            temp1[i] = arr[l + i];

            //l is not 0 all the time, so keep that in mind!
        }

        for(int j=0; j<n2; j++){
            temp2[j] = arr[m+1+j];
        }


        //Fill the original array with the sorted values
        int i = 0,j = 0, k = l;

        //l is not 0 all the time, keep that in mind!
        while(i<n1 && j<n2){

            if(temp1[i]<=temp2[j]){
                arr[k] = temp1[i];
                i++;
            }
            else{
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = temp1[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = temp2[j];
            j++;
            k++;
        }

    }

    void mergeSort(int arr[], int l, int r){

        if(l<r){

            int m = (l+r)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);


        }


    }

    void printArray(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        MergeSort m = new MergeSort();
        int[] arr = {5,1,99,2,81,77};
        int r = arr.length - 1;

        m.mergeSort(arr, 0, r);
        System.out.println("The sorted array is: ");
        m.printArray(arr);
    }



}
