package sorter;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class SorterTest {

    public BubbleSort bubbleSort;

    @BeforeAll
    static void setUpAll(TestInfo testInfo){
        System.out.println(testInfo.getTestClass() + " executing.");
    }

    @BeforeEach
    void setup(TestInfo testInfo) {
        bubbleSort = new BubbleSort();
        System.out.println(testInfo.getDisplayName() + " is being tested");
    }

    @Test
    @DisplayName("sort In Ascending Order")
    public void sortInAscendingOrder() {
        int[] array = {12,1,3,15,20,45,76};
        int[] expectedArray = {1,3,12,15,20,45,76};
        bubbleSort.sort(array);
        Assertions.assertArrayEquals(expectedArray, array);

    }

    @Test
    @DisplayName("bubble sort name is not null")
    public void bubbleSortNameIsNotNull() {
        Assertions.assertNotNull(bubbleSort.getName());
    }

    @Test
    @DisplayName("bubble sort name is not empty")
    public void bubbleSortIsNotEmpty() {
        Assertions.assertNotSame("", bubbleSort.getName());
    }

    @Test
    @DisplayName("bubble sort does not return empty array")
    public void bubbleSortDoesNotReturnEmpty() {
        int[] array = {};
        Assertions.assertNotEquals(0, bubbleSort.sort(array).length);
    }


    @AfterEach
    void tearDown(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + " has finished testing");
    }

    @AfterAll
    static void tearDownAll(TestInfo testInfo){
        System.out.println(testInfo.getTestClass() + " completed");

    }

}
