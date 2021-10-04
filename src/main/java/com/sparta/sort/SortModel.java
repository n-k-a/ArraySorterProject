package com.sparta.sort;

import java.util.Random;

public class SortModel {
    private int[] arr;
    private int[] arrSecond;
    private  Sort undefinedSort;
    private Random rng =new Random();
    private enum COMPARISONSIZE  {SINGLE, DOUBLE};

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
    //method that prints out sort name, the sorted array and method time.
    public void printSort(){

        StringBuilder sb = new StringBuilder();
        sb.append(undefinedSort.getStringArr());
        sb.append(" Sort time is" + undefinedSort.methodTime() + ". Sort Used is");
        sb.append(undefinedSort.sortName() +" ");
        System.out.println(sb.toString());
    }

}
