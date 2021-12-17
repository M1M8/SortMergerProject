package sorter;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort extends Sorter {

    public BubbleSort() {
        this.name = "BubbleSort";
    }

    @Override
    public int[] sort(int[] array) {
        if(array != null) {
            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < array.length; j++) {
                    boolean isLessThan = array[i] > array[j];
                    if(!isLessThan) {
                        int temporaryA = array[i];
                        int temporaryB = array[j];
                        array[i] = temporaryB;
                        array[j] = temporaryA;
                    }
                }
            }
        }

        return array;
    }

    @Override
    public String getName() {
        return this.name;
    }

}

