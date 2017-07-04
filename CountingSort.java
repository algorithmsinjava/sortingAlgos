package com.iamoperand;

/**
 * Created by iamoperand on 4/7/17.
 */
public class CountingSort {

    void countingSort(int a[], int min, int max){

        int newArrayLength = (max-min) + 1;

        int[] countArray = new int[newArrayLength];


        for(int i=0; i<newArrayLength; i++){
            countArray[i] = 0;
        }
        System.out.println("Printing the array for the first time in countArray");
        printArray(countArray);


        for(int i=0; i<(a.length); i++){
                countArray[a[i]-min]++;
        }
        System.out.println("Printing the array for the second time in countArray");
        printArray(countArray);


        for(int i=1; i<newArrayLength; i++){
            countArray[i] += countArray[i-1];
        }
        System.out.println("Printing the array for the third time in countArray");
        printArray(countArray);

        int[] sortedArray = new int[a.length];
        for(int i=0; i<a.length; i++){
            int concernedNum = a[i];
            System.out.println("Concerned num is: " + concernedNum);
            for(int j=0; j<newArrayLength; j++){
                if( (min+j) == concernedNum){
                    int designatedPosition = countArray[j]-1;
                    System.out.println("Designated position is: " + designatedPosition);
                    sortedArray[designatedPosition] = concernedNum;
                    countArray[j]--;
                    break;
                }
            }
        }

        System.out.println("Printing the sorted array");
        printArray(sortedArray);

    }

    int findMin(int a[]){
        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    int findMax(int a[]){

        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }

        return max;
    }

    void printArray(int a[]){

        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        CountingSort cs = new CountingSort();
        int a[] = {3, 6, 1, 2, 9, 4};
        int max = cs.findMax(a);
        int min = cs.findMin(a);
        cs.countingSort(a, min, max);
    }
}

