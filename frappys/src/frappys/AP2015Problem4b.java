package frappys;

import java.lang.reflect.Array;

// @class Range
public class AP2015Problem4b implements AP2015Problem4a {
    int[] arr;
    public AP2015Problem4b(int i1, int i2) {
        int num = i2 - i1 + 1;
        arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = i1 + i;
        }
    }

    @Override
    public boolean contains(int i) {
        for(int k: arr) {
            if (k == i) {
                return true;
            }
        }
        return false;
    }

    // Testing Purposes
    public static void main(String[] args) {
        AP2015Problem4a range1 = new AP2015Problem4b(-3, 2);
        System.out.println(range1.contains(2));
        System.out.println(range1.contains(-3));
        System.out.println(range1.contains(5));
    }
}
