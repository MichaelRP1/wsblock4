package quarter3;

public class Unit6Assignment {
    public static void main(String[] args) {
        //a. i
        int[] arr1;
        //a. ii
        arr1 = new int[20];
        //a. iii
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 100;
        }
        //a. iv
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        //b. i
        int[] arr2 = new int[10];
        //b. ii
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 50;
        }
        //b. iii
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //c. i
        String[] arr3 = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        //c. ii
        for(int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        //2
        int sum = 0;
        for(int i = 0; i < arr1.length; i++) {
            sum+= arr1[i];
        }
        System.out.println(sum);

        //3
        String concat = "";
        for(int i = 0; i < arr3.length; i++) {
            concat+= arr3[i];
        }
        System.out.println(concat);

        /* Final Output:
        100
        101
        102
        103
        104
        105
        106
        107
        108
        109
        110
        111
        112
        113
        114
        115
        116
        117
        118
        119
        50
        51
        52
        53
        54
        55
        56
        57
        58
        59
        a
        b
        c
        d
        e
        f
        g
        h
        i
        j
        2190
        abcdefghij
        */
    }
}
