package quarter3;

// 2D Array Introduction
public class Unit7Introduction {
    public static void main(String[] args) {
        // 5 rows and 4 columns
        double[][] dArray = new double[5][4];

        dArray[2][1] = 3;
        
        //Use initializer to create array
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int rows = dArray.length;
        // Each row can have a different number of columns (but we will not use that)
        int columns = dArray[0].length;
        int total_entries = rows * columns;

        // Walk through 2D array example
        for(int r = 0; r < dArray.length; r++) {
            for(int c = 0; c < dArray[r].length; c++) {
                dArray[r][c] = 2 * r + c;
            }
        }

        for(int r = 0; r < dArray.length; r++) {
            for(int c = 0; c < dArray[r].length; c++) {
                System.out.print(dArray[r][c] + " ");
            }
            System.out.print("\n");
        }

        for(int r = 0; r < arr.length; r++) {
            for(int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.print("\n");
        }

        System.out.println(total_entries);
    }
}