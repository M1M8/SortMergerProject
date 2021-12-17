package arraygenerator;

import user.User;

import java.util.Random;

public class ArrayGenerator {

    private static final int MAX_NUMBER = 100;

    private static int[] array;

    private static int[] generate(final int arrayLength) {
        array = new int[arrayLength];

        for(int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(MAX_NUMBER);
        }

        return array;
    }

    public static int[] getRandomArray(final int arrayLength) {
        return generate(arrayLength);
    }

    public static int getMaxNumber() {
        return MAX_NUMBER;
    }

    public static int[] getArray(){
        return array;
    }
}
