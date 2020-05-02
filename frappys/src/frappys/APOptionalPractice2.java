package frappys;

public class APOptionalPractice2 {
    public static int hailstoneLength(int n) {
        int len = 0;
        while(n != 1) {
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n = 3*n + 1;
            }
            len++;
        }
        return len;
    }

    public static boolean isLongSeq(int n) {
        if(hailstoneLength(n) > n) {
            return true;
        }
        return false;
    }

    public static double propLong(int n) {
        int isLong = 0;
        for(int i = 1; i <= n; i++) {
            if(isLongSeq(i)) {
                isLong++;
            }
        }
        return isLong / n;
    }
}
