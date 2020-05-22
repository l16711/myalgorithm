package bs;

import sort.Sort;
import sort.Utils;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        while (true) {
            int[] arr = Utils.generateRandomArray(20, 100);
            Sort.insertionSort(arr);
            System.out.println("生成数组: ");
            Utils.printArr(arr);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入待查询数字(退出请输入\"q\"): ");
            if (scanner.hasNext()) {
                String next = scanner.next();
                if ("q".equals(next)) {
                    System.exit(0);
                }
                int num = Integer.parseInt(next);
                System.out.println("开始查询...");
                boolean i = BinarySearch.BSisExist(arr, num);
                System.out.println("查询结果: " + i);
            }
        }
    }
}
