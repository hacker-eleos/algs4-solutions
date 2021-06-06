import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class Exercise28Test {
    private static ArrayList<int[]> testCases;

    @BeforeAll
    static void setUpArrays() {
        testCases = new ArrayList<>();
        int[] test1 = new int[]{1, 2, 3, 4, 4, 5, 2, 2, 1, 1, 6, 6, 7, 7, 8, 9};
        testCases.add(test1);
        int[] test2 = new int[]{2, 2, 2, 2, 2, 2, 2};
        testCases.add(test2);
        int[] test3 = new int[]{1};
        testCases.add(test3);
        int[] test4 = new int[]{1, 2, 1, 2, 1, 2, 1, 2};
        testCases.add(test4);
    }

    @Test
    void removeDuplicates() {
        for (int[] testCase : testCases) {
            System.out.println("------------------------------------");
            System.out.println(Arrays.toString(testCase));
            Arrays.sort(testCase);
            int index = Exercise28.removeDuplicates(testCase);
            System.out.println(Arrays.toString(Arrays.copyOf(testCase, index)));
            System.out.println("-------------------------------------");
        }
    }
}