package sort;

public class Sort {

    /**
     * 选择排序 O(n^2)
     * @param arr
     */
    public static void sectionSort(int [] arr) {
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
     * 冒泡排序 O(n^2)
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0;i < arr.length -1;i++) {
            for (int j = 0;j < arr.length - 1 -i;j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j,j+1);
                }
            }
        }
    }

    /**
     * 插入排序 O(n^2)
     * @param arr
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1;i < arr.length;i++) {
            for (int j = i - 1;j >= 0 && arr[j] > arr[j+1];j--) {
                swap(arr,j,j+1);
            }
        }
    }




    /**
     * 交换两个数
     * @param a
     * @param b
     */
    private static void swap (int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 不增加额外变量交换两个数
     * @param a
     * @param b
     */
    private static void swap2 (int[] arr,int a, int b) {
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }


}
