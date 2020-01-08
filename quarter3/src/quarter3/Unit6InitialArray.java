package quarter3;

public class Unit6InitialArray {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        System.out.println(arr[0]);

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 12;
        }

        // Go through array forwards
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        double[] d = new double[10];

        for(int i = 0; i < d.length; i++) {
            d[i] = i * 4;
        }

        // Go through array in reverse
        for(int i = d.length - 1; i >= 0; i--) {
            System.out.println(d[i]);
        }

        int[] z = {1, 3, 5, 7, 9, 11};
        z[1] = 99;
        for(int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }

        String[] strArr = new String[3];
        for(int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        strArr[0] = "aaa";
        strArr[1] = "bbb";
        strArr[2] = "ccc";

        for(int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
