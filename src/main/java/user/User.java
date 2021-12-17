package user;

import java.util.Scanner;

public class User {

    public enum Choice{
        SORTER,
        ARRAY_LENGTH
    }

    private int sorterChoice;
    private int choiceOfArrayLength;

    public User(){
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

    public void setSorterChoice(int choice) {
        this.sorterChoice = choice;
    }

    public int selectChoice(Choice choice) {
        int selection = 0;

        try {
            Scanner scanner = new Scanner(System.in);

            switch (choice) {
                case SORTER:
                    selection = scanner.nextInt();
                    setSorterChoice(selection);
                    break;
                case ARRAY_LENGTH:
                    selection = scanner.nextInt();
                    choiceOfArrayLength = selection;
                    break;
            }

        } catch (Exception isInvalidInput) {
            return 0;
        }

        return selection;
    }

}
