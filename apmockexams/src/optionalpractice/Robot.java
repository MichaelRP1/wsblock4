package optionalpractice;

public class Robot {
    private int[] hall = {3, 3, 3, 3};
    private int pos = 2;
    private boolean facingRight = true;

    // Part A
    private boolean forwardMoveBlocked() {
        if(pos == 0 && facingRight == false) {
            return true;
        } else if (pos == (hall.length - 1) && facingRight == true) {
            return true;
        }
        return false;
    }

    // Part B
    private void move() {
        if(hall[pos] != 0) {
            hall[pos]--;
        } else if(forwardMoveBlocked()) {
            if(facingRight) {
                facingRight = false;
            } else {
                facingRight = true;
            }
        } else {
            if(facingRight) {
                pos++;
            } else {
                pos--;
            }
        }
    }

    // Part C
    public int clearHall() {
       int moves = 0;
       while(!hallIsClear()) {
           move();
           moves++;
       }
       return moves;
    }

    // DO NOT IMPLEMENT
    private boolean hallIsClear() {
        for(int i: hall) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
