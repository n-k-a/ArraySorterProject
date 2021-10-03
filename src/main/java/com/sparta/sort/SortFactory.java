package com.sparta.sort;

public class SortFactory implements SortFactoryInterface {

    @Override
    public Sort createSort(String sortType) {
        if (sortType!=null){
            if(sortType.equalsIgnoreCase("BubbleSort")){
            return new BubbleSort();
            }
            else if (sortType.equalsIgnoreCase("MergeSort")){
                return new MergeSort();
            }
            else if(sortType.equalsIgnoreCase("QuickSort")){
                return new QuickSort();
            }
            else if(sortType.equalsIgnoreCase("BinaryTree")){
                return new BinaryTree();
            }
        }

            return null;

    }
}
