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
        this.model = model;
    }

    public void sortSelect(){
      //  PropertyConfigurator.configure("log4j.properties");
        //boolean loop = true;

        System.out.println("Which sort do you want? Please type in: \n BubbleSort \n MergeSort \n QuickSort");
        String sortChoice = choice.next();
        SortFactory sortFactory= new SortFactory();
        Sort undefinedSort= sortFactory.createSort(sortChoice);
        model.setUndefinedSort(undefinedSort);

    }
    public void setArraySize(){
//        PropertyConfigurator.configure("log4j.properties");
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


        /*while (loop) {
            try {
                arrSize = choice.nextInt();

                /*if (arrSize < 0) {
                    throw new IllegalArgumentException();
                }
                loop = false;
            } catch (InputMismatchException f) {

                System.out.println(f.getMessage());
                logger.warn(f.getMessage());
                System.out.println("This isn't a number");
                loop = true;

            } catch (IllegalArgumentException i) {


                System.out.println(i.getMessage());
                logger.warn(i.getMessage());
                System.out.println("Please enter a positive number as the array size");
                loop = true;

            }


        }
*/

    }
    public void runModelSort(){
        model.runSort();
    }
    public void printArr(){
        PropertyConfigurator.configure("log4j.properties");

        StringBuilder sb = new StringBuilder();
        sb.append(model.getUndefinedSort().getStringArr());
        sb.append(" Sort time is" + model.getUndefinedSort().methodTime() + ". Sort Used is");
        sb.append(model.getUndefinedSort().sortName() +" ");
        System.out.println(sb.toString());
    }

}
