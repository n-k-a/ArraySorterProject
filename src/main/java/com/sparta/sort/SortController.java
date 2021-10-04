package com.sparta.sort;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SortController {
    private static Logger logger = Logger.getLogger("My Application Logger");
    private SortModel model;
    Scanner choice = new Scanner(System.in);
    private enum ComparisonSize  {SINGLE, DUO};
    private ComparisonSize comparisonSize;

    public SortController(SortModel model) {
        PropertyConfigurator.configure("log4j.properties");
        this.model = model;
    }

    public void sortSelect() {
        System.out.println("Which sort do you want? Please type in: \n BubbleSort \n MergeSort \n QuickSort");
        Sort undefinedSort = null;
        SortFactory sortFactory = new SortFactory();
        String sortChoice = "";

        sortChoice = choice.next();

        while (true){
            undefinedSort = sortFactory.createSort(sortChoice);

            if (undefinedSort == null) {
                System.out.println("Please input one of the listed sorts" +
                        "in the right format please.");

                sortChoice = choice.next();
                logger.trace("Builder returned null, value inserted was: " + sortChoice);
                undefinedSort = sortFactory.createSort(sortChoice);
            }
            else{
                break;
            }
    }


        model.setUndefinedSort(undefinedSort);


    }


    public void setArraySize(){
        int arrSize=0;

        System.out.println("Set Array Size");
        try {
             arrSize = choice.nextInt();
        }
        catch (InputMismatchException e){
            logger.warn(e.getMessage());

            System.out.println("Please input a number");
        }

        System.out.println("Do you want to compare sorts? Please enter 'SINGLE' for one sort or 'DUO' to compare" +
                "two different sorts");
        comparisonSize = ComparisonSize.valueOf(choice.next().toUpperCase());
        switch (comparisonSize) {
            case SINGLE:
                model.generateArr(arrSize);
                break;

            case DUO:
                model.generateTwoArr(arrSize);
                break;
            default:
                System.out.println("Nothing valid selected, using single sort");
                model.generateArr(arrSize);
                 comparisonSize = ComparisonSize.SINGLE;
                break;
        }


        System.out.println(java.util.Arrays.toString(model.getArr()) + "Unsorted Array");


    }
    public void runModelSort(){
        model.runSort();
    }
    public void sortCompare(){
  if (comparisonSize == ComparisonSize.DUO){
      model.setArr(model.getArrSecond());
      sortSelect();
      runModelSort();
      System.out.println("Compared Sort is" );
      printArr();
      System.out.println("Time difference between first and second sort is: " +model.getComparedMethodTime());
  }
    }
    public void printArr(){

        StringBuilder sb = new StringBuilder();
        sb.append(model.getUndefinedSort().getStringArr());
        sb.append(" Sort time is" + model.getUndefinedSort().methodTime() + ". Sort Used is");
        sb.append(model.getUndefinedSort().sortName() +" ");
        System.out.println(sb.toString());
        logger.trace("Results of sort:" + sb.toString());

    }

}
