package bs;

public class BinarySearch {

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
}
