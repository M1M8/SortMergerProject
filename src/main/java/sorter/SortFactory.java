package sorter;

import user.User;

public class SortFactory {

    public enum SortAlgorithm {
        BUBBLE
//        MERGE,
//        BINARY
    }

    public SortFactory() {

    }

    public int getNumberOfSorters() {
        return SortAlgorithm.values().length;
    }

    public ISortable getSort(int sorter) {

        if(sorter == 1) {
            return new BubbleSort();
        }
//        } else if(sorter == 2) {
//            return new BinaryTreeSort();
//        } else if(sorter == 3) {
//            return new MergeSort();
//        }

        return null;
    }

}
