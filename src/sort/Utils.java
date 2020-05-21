package sort;

import java.util.Arrays;

public class Utils {
    /**
     * 生成随机数组
     * @param maxSize
     * @param maxValue
     * @return
     */
    public static int[] generateRandomArray (int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0;i < arr.length;i++) {
            arr[i] = (int)((maxValue + 1) * Math.random()) - (int)((maxValue + 1) * Math.random());
        }
        return arr;
    }

    /**
     * 对数器
     * @param arr
     */
    public static void comparator (int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 复制数组
     * @param arr
     * @return
     */
    public static int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0;i < arr.length;i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 判断两个数组是否相等
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean isEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0;i < arr1.length;i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 打印数组
     * @param arr
     */
    public static void printArr(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
