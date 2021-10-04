package com.sparta.sort;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortController {
    private static Logger logger = Logger.getLogger("My Application Logger");
    private SortModel model;
    Scanner choice = new Scanner(System.in);

    public SortController(SortModel model) {
        PropertyConfigurator.configure("log4j.properties");
        this.model = model;
    }

    public void sortSelect() {
        //boolean loop = true;

        System.out.println("Which sort do you want? Please type in: \n BubbleSort \n MergeSort \n QuickSort");
        Sort undefinedSort = null;
        SortFactory sortFactory = new SortFactory();
        String sortChoice = "";

        sortChoice = choice.next();

        while (true){
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
        model.generateArr(arrSize);
        System.out.println(java.util.Arrays.toString(model.getArr()) + "Unsorted Array");


    }
    public void runModelSort(){
        model.runSort();
    }
    public void sortCompare(){
        System.out.println("What other sort do you want to " +
                "compare this to? Y/N?");
        String select = choice.next();
        while (true){
            if (select == "Y"){

            }
            else  if(select == "N"){
                System.out.println("Ending program");
                break;

            }
            break;
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
