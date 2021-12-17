package application;

import arraygenerator.ArrayGenerator;
import display.UI;
import printer.Printer;
import sorter.ISortable;
import sorter.SortFactory;
import user.User;

import java.util.Arrays;

public class Application {

    private UI display;
    private User user;
    private SortFactory sortFactory;

    public Application() {
        this.display = new UI();
        this.user = new User();
        this.sortFactory = new SortFactory();
    }

    private int chooseSortAlgorithm() {
        int userChoice = 0;
        boolean isChoiceInvalid = true;

        while(isChoiceInvalid) {
            userChoice = user.selectChoice(User.Choice.SORTER);
            isChoiceInvalid = userChoice <= 0 || userChoice > sortFactory.getNumberOfSorters();

            if(isChoiceInvalid) {
                Printer.printMessage("Invalid choice, please pick again.");
            }
        }

        return userChoice;
    }

    private int chooseArrayLength() {
        int userChoice = 0;
        boolean isChoiceInvalid = true;

        while(isChoiceInvalid) {
            userChoice = user.selectChoice(User.Choice.ARRAY_LENGTH);
            isChoiceInvalid = userChoice <= 0 || userChoice > ArrayGenerator.getMaxNumber();

            if(isChoiceInvalid) {
                Printer.printMessage("Invalid choice, please pick again.");
            }
        }

        return userChoice;
    }

    private int[] generateRandomArray() {
        return ArrayGenerator.getRandomArray(user.getChoiceOfArrayLength());
    }

    private int[] sortRandomArray(int choice, int[] array){
        ISortable sortable = sortFactory.getSort(choice);
        return sortable.sort(array);
    }

    public void run() {

        display.displayChoiceOfArrays();
        user.setSorterChoice(chooseSortAlgorithm());

        display.displayChoiceOfArraySize();
        user.setChoiceOfArrayLength(chooseArrayLength());

        int[] unsortedArray = generateRandomArray();
        String unsortedString = Arrays.toString(unsortedArray);
        int[] sortedArray = sortRandomArray(user.getSorterChoice(), ArrayGenerator.getArray());
        String sortedString = Arrays.toString(sortedArray);
        display.displayUserResults(user.getChoiceOfArrayLength(), unsortedString, sortedString);

    }

}
