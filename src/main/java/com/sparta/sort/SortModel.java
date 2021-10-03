package com.sparta.sort;

import java.util.Random;

public class SortModel {
    private int[] arr;
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


    public void runSort(Sort undefinedSort, int[] arr){
        this.arr = arr;
        this.undefinedSort = undefinedSort;
        undefinedSort.sortList(arr);
    }
    public int[] generateArr(int arrSize){
        for(int i = 0; i<arrSize; i++){
            int currentArr =  rng.nextInt();
            arr[i] = currentArr;
        }
        return arr;
    }
    public void printSort(){

        StringBuilder sb = new StringBuilder();
        sb.append(undefinedSort.getStringArr());
        sb.append(" Sort time is" + undefinedSort.methodTime() + ". Sort Used is");
        sb.append(undefinedSort.sortName() +" ");
        System.out.println(sb.toString());
    }

}
}
