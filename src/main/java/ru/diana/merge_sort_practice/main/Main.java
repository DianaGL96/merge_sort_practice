package ru.diana.merge_sort_practice.main;
import java.util.Arrays;
import static ru.diana.merge_sort_practice.service.SortingStrings.mergeSort;

public class Main {
    public static void main(String[] args) {
        String[] str = {"practice", "sorting", "teacher", "age", "name"};
        System.out.println(Arrays.toString(str) + "\n");
        String[] sortedArray = mergeSort(str);
        System.out.println("\n" + Arrays.toString(sortedArray));
    }
}
