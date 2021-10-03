package com.sparta.sort;

public class SortController {
    public Sort sortSelect(String chosenSort){
        SortFactory sortFactory = new SortFactory();
        return sortFactory.createSort(chosenSort);
    }
}
