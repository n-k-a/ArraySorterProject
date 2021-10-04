package com.sparta.sort;

import java.util.Random;
import java.util.Scanner;

public class SortMain {



    public static void main(String[] args) {
        SortModel model = new SortModel();
        SortController controller= new SortController(model);
        controller.sortSelect();
        controller.setArraySize();
        controller.runModelSort();
        controller.printArr();


         /*SortModel model = new SortModel();
         SortController controller = new SortController(model);
         controller.sortSelect();


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
       /* for(int i = 0; i<arrSize; i++){
            int currentArr =  rng.nextInt();
            arr[i] = currentArr;
        }
        System.out.println(java.util.Arrays.toString(arr) + "Unsorted Array");
        undefinedSort.sortList(arr);
        System.out.println( printSort(arr, undefinedSort));*/
    }

    }


//Collections.swap(Arrays.asList(ua),ua[i] ,ua[i+1]);
//Collections.swap(ua,ua[i],ua[i-1]);
