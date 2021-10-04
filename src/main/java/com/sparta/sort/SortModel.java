package com.sparta.sort;

import java.util.Random;

public class SortModel {
    private int[] arr;
    private int[] arrSecond;
    private long comparedMethodTime;
    private  Sort undefinedSort;
    private Random rng =new Random();

    public Sort getUndefinedSort() {
        return undefinedSort;
    }

    public void setUndefinedSort(Sort undefinedSort) {
        this.undefinedSort = undefinedSort;
    }
    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int[] getArrSecond() {
        return arrSecond;
    }

    public void setArrSecond(int[] arrSecond) {
        this.arrSecond = arrSecond;
    }

    public void runSort(){
        compareTime(undefinedSort.methodTime());
        undefinedSort.sortList(arr);
    }
    //generates a new array using the given arrsize
    public void generateArr(int arrSize){
         arr = new int[arrSize];

        for(int i = 0; i<arrSize; i++){
            int currentArr =  rng.nextInt();
            arr[i] = currentArr;
        }
    }
    //generates a new array using the given arrsize
    public void generateTwoArr(int arrSize){
        arr = new int[arrSize];
        arrSecond = new int[arrSize];

        for(int i = 0; i<arrSize; i++){
            int currentArr =  rng.nextInt();
            arr[i] = currentArr;
            arrSecond[i] = currentArr;
        }
    }

    //method that prints out sort name, the sorted array and method time.
    public void compareTime(long secondTime){
        if (undefinedSort.methodTime() !=0) {
            comparedMethodTime= undefinedSort.methodTime() - secondTime;
        }
    }

    public long getComparedMethodTime() {
        return comparedMethodTime;
    }
}
