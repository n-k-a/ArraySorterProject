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
        controller.sortCompare();



    }

    }


//Collections.swap(Arrays.asList(ua),ua[i] ,ua[i+1]);
//Collections.swap(ua,ua[i],ua[i-1]);
