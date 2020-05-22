package bs;

public class BinarySearch {

    /**
     * 找出有序队列里是否包含某个数字
     *
     * @param sortedArr
     * @param num
     * @return
     */
    public static boolean BSisExist(int[] sortedArr,int num) {
        if (null == sortedArr || sortedArr.length < 1) {
            return false;
        }
        int L = 0;
        int mid = 0;
        int R = sortedArr.length - 1;
        while(L < R) {
//            mid = (R + L) >> 1;
            mid = L + ((R - L) >> 1);
            if (num == sortedArr[mid]) {
                return true;
            } else if (num > sortedArr[mid]) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return num == sortedArr[L];
    }

    /**
     * 找出有序数组中大于等于某个数的最左侧的位置
     * @param sortedArr
     * @param num
     */
    public static int nearestLeftIndex(int[] sortedArr,int num) {
        int L = 0,R = sortedArr.length -1,index = -1,mid = 0;
        while (L <= R) {
            mid = L + ((R - L) >> 1);
            if (sortedArr[mid] >= num) {
                index = mid;
                R = mid -1;
            } else {
                L = mid + 1;
            }
        }
        return index;
    }

    /**
     * 找出有序数组中小于等于某个数的最右侧的位置
     * @param sortedArr
     * @param num
     * @return
     */
    public static int nearestRightIndex(int[] sortedArr,int num) {
        int L = 0;
        int R = sortedArr.length -1;
        int index = -1;
        int mid = 0;
        while (L <= R) {
            mid = L + ((R - L) >> 1);
            if (sortedArr[mid] <= num) {
                index = mid;
                L = mid + 1;
            } else {
                R = mid -1;
            }
        }
        return index;
    }


    /**
     * 找出数组中的一个局部最小值
     * @param sortedArr
     * @return
     */
    public static int getLessIndex(int[] sortedArr) {
        if (null == sortedArr || sortedArr.length == 0) {
            return -1;
        }
        if (sortedArr.length == 1 || sortedArr[0] < sortedArr[1]) {
            return 0;
        }
        if (sortedArr[sortedArr.length-1] < sortedArr[sortedArr.length -2]) {
            return sortedArr.length -1;
        }

        int L = 1;
        int R = sortedArr.length - 2;
        int mid = 1;
        while (L < R) {
            mid = L + ((R - L) >> 1);
            if (sortedArr[mid] > sortedArr[mid - 1]) {
                L = mid + 1;
            } else if (sortedArr[mid] > sortedArr[mid + 1]) {
                R = mid - 1;
            } else {
                return mid;
            }
        }
        return L;
    }
}
