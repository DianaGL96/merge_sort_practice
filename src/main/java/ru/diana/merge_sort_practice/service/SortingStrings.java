package ru.diana.merge_sort_practice.service;
import java.util.Arrays;

public class SortingStrings {
    public static String[] mergeSort(String[] arr) {
        String[] str1 = Arrays.copyOf(arr, arr.length);
        String[] str2 = new String[arr.length];
        mergeSortInner(str1, str2, 0, arr.length - 1);
        return str1;
    }

    public static void mergeSortInner(String[] str1, String[] str2, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        mergeSortInner(str1, str2, startIndex, middle);
        mergeSortInner(str1, str2, middle + 1, endIndex);
        merger(str1, str2, startIndex, middle, endIndex);
    }

    public static void merger(String[] str1, String[] str2, int startIndex, int middle, int endIndex) {
        System.arraycopy(str1, startIndex, str2, startIndex, endIndex - startIndex + 1);
        int index1 = startIndex;
        int index2 = middle + 1;
        int destIndex = startIndex;
        while (index1 <= middle && index2 <= endIndex) {
            if (str2[index1].length() <= str2[index2].length()) {
                str1[destIndex++] = str2[index1++];
            } else {
                str1[destIndex++] = str2[index2++];
            }
        }
        while (index1 <= middle) {
            str1[destIndex++] = str2[index1++];
        }
        while (index2 <= endIndex) {
            str1[destIndex++] = str2[index2++];
        }
    }
}
