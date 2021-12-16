package display;

import printer.Printer;

public class Display {

    public static void displayChoiceOfArrays() {
        Printer.printMessage("Sort Manager: Sort an array using different sort algorithms");
        Printer.printMessage("Choose an array");
    }

    public static void displayChoiceOfArraySize() {
        Printer.printMessage("Please enter the size of the array you wish to generate (max size 100):");
    }

    public static void displayUserResults() {
        Printer.printMessage("Here's your array...");
        //"Sorting using the [chosenSorter]"

        //"Before sorting: "
        //show unsorted array

        //"After sorting: "
        //show sorted array

        //"Time taken: nanoseconds"
    }
}
