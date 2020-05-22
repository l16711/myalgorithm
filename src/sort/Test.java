package sort;

public class Test {
    public static void main(String[] args) {
        for (int i = 0;i < 100;i++) {
            int[] arr = Utils.generateRandomArray(1000, 1000000);
            int[] comparator = Utils.copyArr(arr);
            Utils.comparator(comparator);
//            Sort.sectionSort(arr);
//            Sort.bubbleSort(arr);
            Sort.insertionSort(arr);
            if (!Utils.isEquals(arr, comparator)) {
                System.out.println("fucking!!!");
                return;
            }
        }
        System.out.println("congratulations!!!");
        int[] arr = Utils.generateRandomArray(20, 100);
        System.out.println("原始数组: ");
        Utils.printArr(arr);
//        Sort.sectionSort(arr);
//        Sort.bubbleSort(arr);
        Sort.insertionSort(arr);
        System.out.println("排序后数组: ");
        Utils.printArr(arr);
    }
}
