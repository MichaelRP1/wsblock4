package optionalpractice;

public class Mountain {
    public static boolean isIncreasing(int[] array, int stop) {
        return true;
    }
    public static boolean isDecreasing(int[] array, int start) {
        return true;
    }

    // Part A
    public static int getPeakIndex(int[] array) {
        int len = array.length;
        if(len < 3) {
            return -1;
        }
        for(int i = 1; i < len - 1; i++) {
            if ((array[i] > array[i-1]) && (array[i] > array[i+1])) {
                return i;
            }
        }
        return -1;
    }

    // Part B
    public static boolean isMountain(int[] array) {
        if(getPeakIndex(array) == -1) {
            return false;
        }
        for(int i = 0; i < getPeakIndex(array) - 1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        for(int i = getPeakIndex(array) + 1; i < array.length - 1; i++) {
            if(array[i] < array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(getPeakIndex(new int[]{11, 22, 33, 22, 11}));
        System.out.println(isMountain(new int[]{1,2,3,2,1}));
    }
}
