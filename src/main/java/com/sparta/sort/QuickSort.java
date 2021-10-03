package com.sparta.sort;

public class QuickSort extends Sort {
    //This is a method to swap two elements.
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    /*this method takes the last selected element as a pivot, places
    the pivot element at the correct position in the sorted array,
    and places all smaller(than the pivot) to left of the pivot
    and elements larger to the right*/
    static int partition(int[]arr,int low, int high){
        //creating the pivot
        int pivot = arr[high];
            /*Index of the smaller element and indicates the right
             position found so far*/
            int i = (low-1);
            for (int j = low; j<=high-1;j++){
            //If element is smaller than the pivot
                if (arr[j]<pivot){
                    //increment smaller element index
                    i++;
                    swap(arr,i,j);
                }
            }
            swap(arr,i+1,high);
            return (i+1);
    }
    //this method implements quick sort, arr is the array sorted
    //low is starting index, high is ending index
    static void quickSort(int[] arr,int low, int high){
    if(low<high){
        //pi is partitioning index, is now at the right place
        int pi= partition(arr,low, high);
        //separately sort element before partition and after partition
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }
    }
    @Override
    //this is the method that calls the quicksort and returns the sorted
    //array
    public int[] sortList(int[] arr) {
        super.startMethodTime= System.nanoTime();

        int n = arr.length;
    //initial call with arr, first and last array
    quickSort(arr,0, n-1);
        super.endMethodTime= System.nanoTime();
        setStringArr(java.util.Arrays.toString(arr));
        return arr;
    }
}
