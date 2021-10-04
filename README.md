# ArraySorterProject

 ## Synopsis
 This is an array sorting project developed as part of my sparta global Java course.
 This is a rudementary consoleline project which allows for someone to create a random generated int[] array which can be sorted from smallest to largest using one of 3 arrays:
- BubbleSort
- QuickSort
- MergeSort

The sorted array can then be printed to the console along with the name of the sort type and the time it took for the sort to happen.
The use of enums with a DUO or SINGLE option allows the user to either print one sorted array of a given sort type, or the use of two different sorts in order to compare
the sort times.
There is a logger which records values such as the file exception for a negative array value, along with generally logging the values of the sorted arrays.

## File Structure
There are two packages in this, MVC and Sort.
Sort contains the Sort files, including the factory class, the three sorts, the abstract sort class that the sorts used in the project have inherited. There is a 4th class called
Binary Tree. However it doesn't work.
Sort is an abstract class used throughout in order to utilise polymorphism with its three (four) sub classes, the already mentioned sorts.
The MVC package contains the controller, model and the main.

The controller controls how the console line prompts get turned into values for the model to calculate the sorts. There is no currently implemented View() class.
The main class is what runs the program and executes the MVC classes as objects. Below is how the main(String[]args) should look like.

        SortModel model = new SortModel();
        
        SortController controller= new SortController(model);
        
        controller.sortSelect();
        
        controller.setArraySize();
        
        controller.runModelSort();
        
        controller.printArr();
        
        controller.sortCompare();
        


THere's a test folder and Junit class called SortTargetTester which as of current only has 4 or so tests working, and only 3/4 pass. These tests just check if the array is sorted by the current 4 sorting algorithms
in the project by comparing it to what it should be sorted as an array.

## Running the project
In order to run this project, you need Java JDK 14, as that was what I've used for my IntelliJ project
To run the project, make sure that "SortMain(1)" is selected as the file to run.
Once these steps have been resolved, all that is needed to be done is to follow the steps given by the console line in order to execute the class
