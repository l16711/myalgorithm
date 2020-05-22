package xor;

import sort.Utils;

public class Test {
    public static void main(String[] args) {
//        int[] arr= {2,1,4,5,2,1,4};
//        int oddNumTimes = XOR.getOddNumTimes(arr);
//        System.out.println(oddNumTimes);
//
//        int N = 6;
//        System.out.println("二进制输出:" + Integer.toBinaryString(N));
//        int rightBit1 = XOR.getRightBit1(N);
//        System.out.println("二进制输出:" + Integer.toBinaryString(rightBit1));

        int[] arr= {2,1,9,4,5,2,1,4,2,1,9,4,5,2,1,9,4,5};
        Utils.printArr(arr);
        XOR.get2OddNumTimes(arr);

    }
}
