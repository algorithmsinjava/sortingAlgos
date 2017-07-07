package com.iamoperand;

import java.util.Scanner;

/**
 * Created by iamoperand on 7/7/17.
 */
public class LinearSearch {


    int linearSearch(int search, int a[]){

        for(int i=0; i<a.length; i++){
            if(a[i] == search){
                return i;
            }


        }
        return -1;
    }
    public static void main(String args[]){
       LinearSearch l = new LinearSearch();
        int[] array = {6, 5, 2, 1, 5, 3};
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();

        int pos = l.linearSearch(search, array);

        if (pos == -1) {
            System.out.println("Number not found");
        }else{
            System.out.println("Number found at position: " + (pos+1));
        }

    }
}
