package frappys;

public class FRQPractice3CD {
    public static int getCheck(int num) {
        int sum = 0;
        for(int i = 1; i <= getNumberOfDigits(num); i++) {
            sum += (8-i) * getDigit(num, i);
        }
        return getDigit(getNumberOfDigits(sum));
    }

    public static boolean isValid(int numwc) {
        int num = (numwc - getDigit(getNumberOfDigits(numwc))) / 10;
        int check = getDigit(getNumberOfDigits(numwc));

        if(check == getCheck(num)) {
            return true;
        }
        return false;
    }
}
