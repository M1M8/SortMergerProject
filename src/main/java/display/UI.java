package display;

import printer.Printer;

public class UI {

    public UI() {
    }

    public void displayChoiceOfArrays() {
        Printer.printMessage("Sort Manager: Sort an array using different sort algorithms");
        Printer.printMessage("Pick a sort algorithm [Enter corresponding number]: ");
        Printer.printMessage("1. BubbleSort");
//        Printer.printMessage("2. BinaryTreeSort");
//        Printer.printMessage("3. MergeSort");

    }

    public void displayChoiceOfArraySize() {
        Printer.printMessage("Please enter the size of the array you wish to generate (max size 100):");
    }

    public void displayUserResults(int lengthOfArray, String unsortedArray, String sortedArray) {
        Printer.printMessage("Sorting using the");

        Printer.printMessage("Before sorting:");
        Printer.printMessage("Length of Array: " + lengthOfArray);
        Printer.printMessage(unsortedArray);

        Printer.printMessage("After sorting:");
        Printer.printMessage(sortedArray);

        //"Time taken: nanoseconds"
        Printer.printMessage("Time taken: ");
    }
}
