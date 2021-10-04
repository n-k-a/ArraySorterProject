package com.sparta.sort;

import java.util.Random;
import java.util.Scanner;

public class SortMain {


    public static String printSort(int[] arr, Sort usedSort){

        StringBuilder sb = new StringBuilder();
        sb.append(usedSort.getStringArr());
        sb.append(" Sort time is" + usedSort.methodTime() + ". Sort Used is");
        sb.append(usedSort.sortName() +" ");
        return sb.toString();
    }
    public static void main(String[] args) {
        SortFactory factory = new SortFactory();
        Sort undefinedSort;
        Random rng =new Random();

        System.out.println("Which sort do you want? Please type in: \n BubbleSort \n MergeSort \n QuickSort");
        Scanner choice = new Scanner(System.in);
        String sortChoice = choice.next();
        undefinedSort= factory.createSort(sortChoice);
        System.out.println("Set Array Size");
        int arrSize = choice.nextInt();
        int[] arr = new int[arrSize];

        /*try {
        }
        catch(InputMismatchException e){

        }*/
        for(int i = 0; i<arrSize; i++){
            int currentArr =  rng.nextInt();
            arr[i] = currentArr;
        }
        System.out.println(java.util.Arrays.toString(arr) + "Unsorted Array");
        undefinedSort.sortList(arr);
        System.out.println( printSort(arr, undefinedSort));
    }
    public void printSort(Sort undefinedSort){

        StringBuilder sb = new StringBuilder();
        sb.append(undefinedSort.getStringArr());
        sb.append(" Sort time is" + undefinedSort.methodTime() + ". Sort Used is");
        sb.append(undefinedSort.sortName() +" ");
        System.out.println(sb.toString());
    }


    }


//Collections.swap(Arrays.asList(ua),ua[i] ,ua[i+1]);
//Collections.swap(ua,ua[i],ua[i-1]);
