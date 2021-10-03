package com.sparta.sort;

import java.util.Scanner;

public class SortView {
    private Scanner choice;
    public String selectedSort;
    public void PrintArr(String sortedArr){
        System.out.println(sortedArr);
    }
    public String loadChoice(){
        System.out.println("Which sort do you want? Please type in: \n BubbleSort \n MergeSort \n QuickSort");
         choice = new Scanner(System.in);
         String sortChoice = choice.next();
        return sortChoice;
    }
    /*public Scanner(){
        System.out.println("Please enter the size of your array");*/
   // }
    public Scanner loadArrs(){
        System.out.println("Please Enter the members of your array, using ',' as a way to split the members.");
        choice = new Scanner(System.in);
        return choice;
    }
}
