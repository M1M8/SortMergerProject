package application;

import display.Display;
import user.User;

public class Application {

    private static User user = new User();

    private static void choose(User.Choice choice) {
        int intChoice = 0;

        while(intChoice <= 0) {

            intChoice = switch (choice) {
                case SORTER -> user.setUserSelection(User.Choice.SORTER);
                case ARRAY_LENGTH -> user.setUserSelection(User.Choice.ARRAY_LENGTH);
            };

            if(intChoice <= 0) {
                System.out.println("Invalid input, please try again");
            }
        }

    }

    public static void run() {

        Display.displayChoiceOfArrays();
        choose(User.Choice.SORTER);

        Display.displayChoiceOfArraySize();
        choose(User.Choice.ARRAY_LENGTH);

        Display.displayUserResults();

    }


}
