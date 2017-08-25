package com.interview.binarysearch;

/**
 * Regular binary search
 */
public class BinarySearch {

    public int search(int input[],int search){
        int start = 0;
        int end = input.length-1;
        int mid = 0;
        
        while(start <= end){
            mid = (start + end)/2;
            
            if(input[mid] == search){
                return mid;
            }else if(input[mid] < search){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        BinarySearch bs = new BinarySearch();
        int arr1[] = {1,2,4,5,7,8};
        System.out.println(bs.search(arr1, -1));
        System.out.println(bs.search(arr1, 1));
        System.out.println(bs.search(arr1, 8));
        System.out.println(bs.search(arr1, 2));
    }
}
