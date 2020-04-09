package frappys;

import java.util.ArrayList;

// public class Digits
public class AP2017Problem1 {
    private ArrayList<Integer> digitList;
    public AP2017Problem1(int input) {
        digitList = new ArrayList<>();
        String proc = Integer.toString(input);
        int length = proc.length();
        for(int i = 0; i < length; i++) {
            if(input == 0) {
                digitList.add(0);
            } else {
                digitList.add(0, input % 10);
                input /= 10;
            }
            
        }
    }

    public boolean isStrictlyIncreasing() {
        if (digitList.size() == 1) {
            return true;
        }
        for(int i = 1; i < digitList.size() - 1; i++) {
            if(digitList.get(i-1) >= digitList.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AP2017Problem1 n1 = new AP2017Problem1(7);
        AP2017Problem1 n2 = new AP2017Problem1(1356);
        AP2017Problem1 n3 = new AP2017Problem1(1336);
        AP2017Problem1 n4 = new AP2017Problem1(1536);
        AP2017Problem1 n5 = new AP2017Problem1(65310);

        System.out.println(n1.isStrictlyIncreasing());
        System.out.println(n2.isStrictlyIncreasing());
        System.out.println(n3.isStrictlyIncreasing());
        System.out.println(n4.isStrictlyIncreasing());
        System.out.println(n5.isStrictlyIncreasing());
    }
}