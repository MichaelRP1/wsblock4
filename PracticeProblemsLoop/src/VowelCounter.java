import java.util.Scanner;
public class VowelCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scan.next();
        char c = 'B';
        int count = 0;
        int length = string.length();

        for (int i = 0; i < length; i++) {
            c = string.charAt(i);

            if (c == 'A') {
                count++;
            } else if (c == 'E') {
                count++;
            } else if (c == 'I') {
                count++;
            } else if (c == 'O') {
                count++;
            } else if (c == 'U') {
                count++;
            } else if (c == 'a') {
                count++;
            } else if (c == 'e') {
                count++;
            } else if (c == 'i') {
                count++;
            } else if (c == 'o') {
                count++;
            } else if (c == 'u') {
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}
