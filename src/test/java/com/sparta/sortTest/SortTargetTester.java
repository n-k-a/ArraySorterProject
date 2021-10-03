package com.sparta.sortTest;
import com.sparta.sort.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class SortTargetTester {
    //the first three tests check whether the sorts actually work in sorting the arrays
    @Test
    public void testSortsB() {
        int[] testArr = {3, 4, 2, 1, 5, 9, 7, 6, 8};
        BubbleSort sort = new BubbleSort();
        sort.sortList(testArr);
        assertTrue(Arrays.equals(testArr, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    public void testSortsQ() {
        int[] testArr = {3, 4, 2, 1, 5, 9, 7, 6, 8};
        Sort sort = new QuickSort();
        sort.sortList(testArr);
        assertTrue(Arrays.equals(testArr, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    public void testSortsM() {
        int[] testArr = {3, 4, 2, 1, 5, 9, 7, 6, 8};
        MergeSort sort = new MergeSort();
        sort.sortList(testArr);
        assertTrue(Arrays.equals(testArr, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    public void testSortsBT() {
        int[] testArr = {3, 4, 2, 1, 5, 9, 7, 6, 8};
        BinaryTree sort = new BinaryTree();
        sort.sortList(testArr);
        sort.inOrder();
        assertTrue(Arrays.equals(testArr, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    /*@Test
    public void testArrNull() {
        int[] testArr = {};999
        BubbleSort sort = new BubbleSort();

    }*/
    /* @Test
    public void testSortTypeNull() {
        int[] testArr = {};

    }

     */
}