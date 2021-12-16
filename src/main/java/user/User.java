package user;

import java.util.Scanner;

public class User {

    public enum Choice{
        SORTER,
        ARRAY_LENGTH
    }

    private int sorterChoice;
    private int choiceOfArrayLength;

    public User() {
        this.sorterChoice = 0;
        this.choiceOfArrayLength = 0;
    }

    public int getChoiceOfArrayLength() {
        return choiceOfArrayLength;
    }

    public void setChoiceOfArrayLength(int choiceOfArrayLength) {
        this.choiceOfArrayLength = choiceOfArrayLength;
    }

    public int getSorterChoice() {
        return sorterChoice;
    }

    public void setSorterChoice(int sorterChoice) {
        this.sorterChoice = sorterChoice;
    }

    public int setUserSelection(Choice choice) {

        int selection;

        switch (choice) {
            case SORTER:
                selection = sorterChoice;
                break;
            case ARRAY_LENGTH:
                selection = choiceOfArrayLength;
                break;
        }

        try {
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();
        } catch (Exception isInvalidInput) {
            return 0;
        }

        return selection;
    }

}
