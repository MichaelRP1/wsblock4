package optionalpractice;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    // Part A
    public TokenPass(int playerCount) {
        board = new int[playerCount];
        currentPlayer = (int) (Math.random() * playerCount);
        for(int player: board) {
            player = (int) (Math.random() * 10) + 1;
        }
    }

    // Part B
    public void distributePlayerTokens() {
        int pos = currentPlayer + 1;
        while (board[currentPlayer] > 0) {
            if(pos == board.length) {
                pos = 0;
            }
            board[pos]++;
            pos++;
        }
    }
}
