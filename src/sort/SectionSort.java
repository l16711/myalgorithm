package sort;

import java.util.Arrays;

public class SectionSort {

    /**
     * 选择排序
     * @param arr
     */
    public static void sort (int [] arr) {
        for (int i = 0;i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1;j < arr.length;j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                swap(arr,i,minIndex);
            }
        }
    }

    /**
     * 交换两个数
     * @param a
     * @param b
     */
    public static void swap (int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 不增加额外变量交换两个数
     * @param a
     * @param b
     */
    public static void swap2 (int[] arr,int a, int b) {
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }


    public static void main(String[] args) {
        int[] ints = new int[0];
        System.out.println(ints.length);
    }
}
