package frappys;

public class AP2015Problem1 {
    private static int arraySum(int[] arr) {
        int sum = 0;
        for(int val: arr) {
            sum += val;
        }
        return sum;
    }

    private static int[] rowSums(int[][] arr) {
        int[] output = new int[arr.length];
        for(int r = 0; r < arr.length; r++) {
            int sum = 0;
            for(int c = 0; c < arr[r].length; c++) {
                sum += arr[r][c];
            }
            output[r] = sum;
        }
        return output;
    }

    private static boolean isDiverse(int[][] arr) {
        int[] sums = rowSums(arr);
        for(int i = 0; i < sums.length; i++) {
            for(int j = 0; j < sums.length; j++) {
                if((i != j) && (sums[i] == sums[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    // Not part of FRAPPY, just eliminating errors
    public static void main(String[] args) {
        int[][] mat1 = {{1, 1, 5, 3, 4}, {12, 7, 6, 1, 9}, {8, 11, 10, 2, 5}, {3, 2, 3, 0, 6}};
        System.out.print(isDiverse(mat1));
        System.out.print(arraySum(mat1[0]));
    }
}