package Game_1;
import java.util.*;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 Random r = new Random();
		 System.out.println("There are 1-9 position in the box....");
		char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		printBoard(board);
		while(checkIfanyBoardposIsEmpty(board)) {
			System.out.println("Where would you like to play? ");
			int userInput = in.nextInt();
			input(board,userInput, 'X');
			int comInput = r.nextInt(10)+1;
			System.out.println("Computer plays in "+comInput+" no position");
			input(board,comInput, 'O');
			printBoard(board);
			if(thegameisover()) break;
		}
		if(thegameisover()) System.out.println();
		
	}

	private static boolean thegameisover() {
		
		return false;
	}

	private static boolean checkIfanyBoardposIsEmpty(char[][] board) {
		if(board[0][0]==' '||board[0][1]==' '||board[0][2]==' '||
				board[1][0]==' '||board[1][1]==' '||board[1][2]==' '||
						board[2][0]==' '||board[2][1]==' '||board[2][2]==' '
				) return true;
		else return false;
		
		
	}

	/**
	 * @param board
	 * @param userInput
	 */
	private static void input(char[][] board, int Input,char symbol) {
		
		switch(Input) {
		case 1: if(board[0][0] ==' ') board[0][0] = symbol;
		else return;
		case 2: if(board[0][1] ==' ') board[0][1] = symbol;
		else return;
		case 3: if(board[0][2] ==' ') board[0][2] = symbol;
		else return;
		case 4: if(board[1][0] ==' ') board[1][0] = symbol;
		else return;
		case 5: if(board[1][1] ==' ') board[1][1] = symbol;
		else return;
		case 6: if(board[1][2] ==' ') board[1][2] = symbol;
		else return;
		case 7: if(board[2][0] ==' ') board[2][0] = symbol;
		else return;
		case 8: if(board[2][1] ==' ') board[2][1] = symbol;
		else return;
		case 9: if(board[2][2] ==' ') board[2][2] = symbol;
		else return;
		default:System.out.println("Please Enter a valid input range from 1 to 9");
		}
	}

	private static void printBoard(char[][] board) {
		System.out.println(board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
		System.out.println("-+-+-+");
		System.out.println(board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
		System.out.println("-+-+-+");
		System.out.println(board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
		
	}

}
