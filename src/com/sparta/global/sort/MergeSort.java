package com.sparta.global.sort;

public class MergeSort extends Sort{
private int l;
private int r;
private int m;
    @Override
    public int[] sortList(int[] arr) {
        //setLMR(arr);
        this.l = arr[0];
        this.r = arr[(arr.length-1)];
        System.out.println();
        mergeSort(arr,l,r);

        return arr;
    }

    //method to set start, end and midpoint of array to be sorted
    /*private void setLMR(int[]arr){
        this.l = arr[0];
        this.r = arr[(arr.length-1)];
        //this.m = arr[((arr.length-1)/2)];
    }*/
    //method to create merge array
    private void merge(int[] arr, int l, int r, int m){
        this.l = l;
        this.m = m;
        this.r = r;
        //second array to put smaller elements into
        int[] temp = new int[r-l +1];
        //iterators for the start and midpoint of loop, along with iterator for temp
        int i = l; int j = m+1;int k =0;
        //while smaller than the midpoint or end point
        while(i<=m && j<=r){
            //if this value near the head is smaller or equal to the one that started from the middle
            if(arr[i]<=arr[j]){
                //add it to the temp array
                temp[k] = arr[i];
                k++; i++;
            }
            //if inverse add the one from the midpoint sequence to the temp
            else{
                temp[k] = arr[j];
                k++; j++;
            }
        }
        //add remaining elements from the left to mid
        while(i<=m){
            temp[k] = arr[i];
            k++; i++;
        }
        //add remaining elements from the mid to right
        while(j<=r){
            temp[k] = arr[j];
            k++; j++;
        }
        //replace original array with temp
        for (i =l;i<=r;i++){
            arr[i] = temp[i-l];
        }
    }
    private void mergeSort(int arr[], int l, int r){
        if (l<r){
            this.m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,l,r);
            merge(arr, l,r,m);

        }
    }
}
