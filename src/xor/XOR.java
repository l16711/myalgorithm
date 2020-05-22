package xor;

public class XOR {

    /**
     * 异或 : 相同为0,不同为1
     * 计算方法:  无进位相加
     * 性质:  1、  0^N == N      N^N == 0
     *        2、  异或运算满足交换律和结合率
     */

    //<=========================题目1=========================
    /**
     * 题目1：不增加额外变量交换两个数（不建议使用）
     * @param a
     * @param b
     */
    private static void swap2 (int[] arr,int a, int b) {
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }

    //========================================================>

    //<=========================题目2=========================

    /**
     * 题目2：一个数组中有一种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数
     */

    public static int getOddNumTimes(int[] arr) {
        int num = arr[0];
        for (int i = 1;i < arr.length;i++) {
            num ^= arr[i];
        }
        return num;
    }

    //========================================================>

    //<=========================题目3=========================

    /**
     * 题目3：怎么把一个int类型的数，提取出最右侧的1来
     */
    public static int getRightBit1(int N) {
        return N & (~N +1);
    }
    //========================================================>


    //<=========================题目4=========================
    /**
     * 一个数组中有两种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这两种数
     */

    public static void get2OddNumTimes(int[] arr) {
        int xor = 0;
        for (int i = 0;i < arr.length;i++) {
            xor ^= arr[i];
        }
        int rightOne = xor & (~xor + 1);
        int arrOne = 0;
        for (int i = 0;i < arr.length;i++) {
            if ((rightOne & arr[i]) != 0) {
                arrOne ^= arr[i];
            }
        }
        System.out.println("出现奇数次的数据是:" + arrOne + "   -----   " + (xor^arrOne));
    }


    //========================================================>

}
