package com.sparta.sort;
import java.util.Arrays;

public abstract class Sort {
    private int[] returnedArr;

    public String getStringArr() {
        return stringArr;
    }

    public void setStringArr(String stringArr) {
        this.stringArr = stringArr;
    }

    private String stringArr;


    public long getEndMethodTime() {
        return endMethodTime;
    }

    public void setEndMethodTime(long endMethodTime) {
        this.endMethodTime = endMethodTime;
    }

    public long getStartMethodTime() {
        return startMethodTime;
    }

    public void setStartMethodTime(long startMethodTime) {
        this.startMethodTime = startMethodTime;
    }

    long endMethodTime;
    long startMethodTime;

    public long methodTime(){
        return (endMethodTime-startMethodTime);

    }
    public String sortName(){
        return this.getClass().getSimpleName();
    }

     public abstract int[] sortList(int[] arr);



     }
