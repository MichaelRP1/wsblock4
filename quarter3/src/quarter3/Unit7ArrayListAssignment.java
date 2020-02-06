package quarter3;
import java.util.ArrayList;

class Unit7ArrayListAssignment {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr.size());

        for(int i = 0; i < 10; i++) {
            arr.add(i * 3);
        }

        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("\n");

        arr.add(3, 5);

        System.out.println(arr);

        int val = arr.set(7, 4);
        System.out.println(val);

        System.out.println(arr);

        val = arr.remove(0);
        System.out.println(val);

        System.out.println(arr);

        /* 0
        0 3 6 9 12 15 18 21 24 27 
        [0, 3, 6, 5, 9, 12, 15, 18, 21, 24, 27]
        18
        [0, 3, 6, 5, 9, 12, 15, 4, 21, 24, 27]
        0
        [3, 6, 5, 9, 12, 15, 4, 21, 24, 27] */
    }
}