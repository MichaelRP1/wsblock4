package frappys;

import java.util.ArrayList;

public class AP2015Problem4c implements AP2015Problem4a {
    // Implementation other than method 'contains' not shown
    public boolean contains(int num) {
        int size = alist.size();
        for(int j = 0; j < size; j++) {
            if(alist.get(j).contains(num)) {
                return true;
            }
        }
        return false;
    }
}
