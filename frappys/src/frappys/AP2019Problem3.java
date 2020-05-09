package frappys;

import java.util.ArrayList;

public class AP2019Problem3 {
    private String openDel;
    private String closeDel;

    public AP2019Problem3(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> del = new ArrayList<>();
        for(String i: tokens) {
            if(i.equals(openDel) || i.equals(closeDel)) {
                del.add(i);
            }
        }
        return del;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int numOpen = 0;
        int numClose = 0;

        for(String i: delimiters) {
            if(i.equals(openDel)) {
                numOpen++;
            }
            if(i.equals(closeDel)) {
                numClose++;
            }
            if (numClose > numOpen) {
                return false;
            }
        }
        if(numOpen == numClose) {
            return true;
        }
        return false;
    }
}
