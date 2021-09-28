import com.sparta.global.sort.BubbleSort;
import com.sparta.global.sort.MergeSort;
import com.sparta.global.sort.Sort;
import com.sparta.global.sort.SortFactory;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {
        SortFactory factory = new SortFactory();
        Sort undefinedSort;
        int[] testArr = {3, 4, 2, 1, 5, 9, 7, 6, 8};
        System.out.println("Which sort do you want? Please type in: \n BubbleSort \n MergeSort \n QuickSort");
        Scanner choice = new Scanner(System.in);
        String sortChoice = choice.next();
        undefinedSort= factory.createSort(sortChoice);
        undefinedSort.sortList(testArr);
        undefinedSort.printArr(testArr);

       /* ArrayList<Person> personList = new ArrayList<Person>();
        ArrayList<Phone> phoneList = new ArrayList<Phone>();
        //for (Messagable m: personList)
        for (Messagable m : phoneList){
            //using late binding with classes that implemented the messagable interface.
          m.sendMessage();
        }
        //static function can be called without initialising an object implementing this.
        Messagable.anotherFunction();*/
        //BubbleSort testSort = new BubbleSort();
        //MergeSort testSort2 = new MergeSort();

        //testSort2.sortList(testArr);
        //testSort2.printArr(testArr);
        //testSort.sortList(testArr);
        //testSort.printArr(testArr);
     /*
        int[] testArr = {3, 4, 2, 1, 5, 9, 7, 6, 8};
        Rectangle[] testRecArr ={
                new Rectangle(5,6),
                new Rectangle(2,3),
                new Rectangle(4,3),
                new Rectangle(1,1),
                new Rectangle(5,9),
                new Rectangle(2,2)

        };
        List<Rectangle> recList = Arrays.asList(testRecArr);
        Collections.sort(recList);
        System.out.println(recList);
        testArr = BubbleSort(testArr);
        for(int i = 0; i<=testArr.length-1; i++){
            System.out.println(testArr[i]);
        }

        testRecArr = BubbleSortRec(testRecArr);
        for (int i = 0; i<=testRecArr.length-1;i++){
            System.out.println(testRecArr[i].toString() + "Area is = " + testRecArr[i].CalculateArea());
        }
    */}

    public static Rectangle[] BubbleSortRec(Rectangle[] ua) {
        Rectangle temp = new Rectangle();
        for(int j=0; j<ua.length-1; j++){
            for (int i = 0; i < ua.length - 1; i++) {
                if (ua[i].CalculateArea() > ua[i + 1].CalculateArea()) {
                    temp = ua[i + 1];
                    ua[i + 1] = ua[i];
                    ua[i] = temp;

                }
            }


        }
        return ua;

    }



    }


//Collections.swap(Arrays.asList(ua),ua[i] ,ua[i+1]);
//Collections.swap(ua,ua[i],ua[i-1]);
