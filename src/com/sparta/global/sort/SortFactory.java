package com.sparta.global.sort;

public class SortFactory implements SortFactoryInterface {

    @Override
    public Sort createSort(String sortType) {
        if (sortType!=null){
            if(sortType.equals("BubbleSort")){
            return new BubbleSort();
            }
            else if (sortType.equals("MergeSort")){
                return new MergeSort();
            }
        }

            return null;

    }
}
