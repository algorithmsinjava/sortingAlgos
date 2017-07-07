package com.iamoperand;

import java.util.Scanner;

/**
 * Created by iamoperand on 7/7/17.
 */
public class RecursiveBinarySearch {

    int recursiveBinarySearch(int[] a, int left, int right, int search){

        if(left <= right){

            int mid = left + ( ( (right+1) - left ) / 2 );
            //System.out.println("The position of mid is: " + mid);
            if(a[mid] == search){
                return mid+1;
            }else if(a[mid] > search){
                int returned = recursiveBinarySearch(a, left, mid-1, search);
                return returned;
            }else if(a[mid] < search){
                int returned = recursiveBinarySearch(a, mid+1, right, search);
                return returned;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        RecursiveBinarySearch b = new RecursiveBinarySearch();
        int[] arr = {3, 5, 6, 8, 10, 12};

        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
        int pos = b.recursiveBinarySearch(arr, 0, arr.length-1, search);


        if(pos == -1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number found at position: " + pos);
        }

    }
}
