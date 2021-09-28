package com.sparta.global.sort;

public class BubbleSort extends Sort{


@Override
    public int[] sortList(int[] arr){
    int temp = 0;
    for (int j = 0; j < arr.length - 1; j++) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;

            }
        }


    }
    return arr;

}



}