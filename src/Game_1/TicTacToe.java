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
			if(thegameisover(board)) break;
			int comInput = r.nextInt(10)+1;
			System.out.println("Computer plays in "+comInput+" no position");
			input(board,comInput, 'O');
			if(thegameisover(board)) break;
			printBoard(board);
			
		}
		if(thegameisover(board) ) {
			char c = checkThewinner(board);
			System.out.println(c+" Won the game");
			
		}
		else System.out.println("The game is tied");
		
		
	}

	private static char checkThewinner(char[][] board) {
		if(board[0][0] == 'X' && board[0][1] == 'X'&&board[0][2] == 'X') return 'X';
		else if(board[1][0] == 'X' && board[1][1] == 'X'&&board[1][2] == 'X') return 'X';
		else if(board[2][0] == 'X' && board[2][1] == 'X'&&board[2][2] == 'X') return 'X';
		else if(board[0][0] == 'X' && board[1][0] == 'X'&&board[2][0] == 'X') return 'X';
		else if(board[0][1] == 'X' && board[1][1] == 'X'&&board[2][1] == 'X') return 'X';
		else if(board[0][2] == 'X' && board[1][2] == 'X'&&board[2][2] == 'X') return 'X';
		else if(board[0][2] == 'X' && board[1][1] == 'X'&&board[2][0] == 'X') return 'X';
		else if(board[0][0] == 'X' && board[1][1] == 'X'&&board[2][2] == 'X') return 'X';	
		else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') return 'O';
		else if(board[1][0] == 'O' && board[1][1] == 'O'&& board[1][2] == 'O') return 'O';
		else if(board[2][0] == 'O' && board[2][1] == 'O'&&board[2][2] == 'O') return 'O';
		else if(board[0][0] == 'O' && board[1][0] == 'O'&&board[2][0] == 'O') return 'O';
		else if(board[0][1] == 'O' && board[1][1] == 'O'&&board[2][1] == 'O') return 'O';
		else if(board[0][2] == 'O' && board[1][2] == 'O'&&board[2][2] == 'O') return 'O';
		else if(board[0][2] == 'O' && board[1][1] == 'O'&&board[2][0] == 'O') return 'O';
		else if(board[0][0] == 'O' && board[1][1] == 'O'&&board[2][2] == 'O') return 'O';
		
		return 'f';
		
	}

	private static boolean thegameisover(char[][] board) {
		if(board[0][0] == 'X' && board[0][1] == 'X'&&board[0][2] == 'X') return true;
		else if(board[1][0] == 'X' && board[1][1] == 'X'&&board[1][2] == 'X') return true;
		else if(board[2][0] == 'X' && board[2][1] == 'X'&&board[2][2] == 'X') return true;
		else if(board[0][0] == 'X' && board[1][0] == 'X'&&board[2][0] == 'X') return true;
		else if(board[0][1] == 'X' && board[1][1] == 'X'&&board[2][1] == 'X') return true;
		else if(board[0][2] == 'X' && board[1][2] == 'X'&&board[2][2] == 'X') return true;
		else if(board[0][2] == 'X' && board[1][1] == 'X'&&board[2][0] == 'X') return true;
		else if(board[0][0] == 'X' && board[1][1] == 'X'&&board[2][2] == 'X') return true;	
		else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') return true;
		else if(board[1][0] == 'O' && board[1][1] == 'O'&& board[1][2] == 'O') return true;
		else if(board[2][0] == 'O' && board[2][1] == 'O'&&board[2][2] == 'O') return true;
		else if(board[0][0] == 'O' && board[1][0] == 'O'&&board[2][0] == 'O') return true;
		else if(board[0][1] == 'O' && board[1][1] == 'O'&&board[2][1] == 'O') return true;
		else if(board[0][2] == 'O' && board[1][2] == 'O'&&board[2][2] == 'O') return true;
		else if(board[0][2] == 'O' && board[1][1] == 'O'&&board[2][0] == 'O') return true;
		else if(board[0][0] == 'O' && board[1][1] == 'O'&&board[2][2] == 'O') return true;
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
		case 1:  board[0][0] = symbol;
		break;
		case 2: board[0][1] = symbol;
		break;
		case 3:  board[0][2] = symbol;
		break;
		case 4:  board[1][0] = symbol;
		break;
		case 5:  board[1][1] = symbol;
		break;
		case 6: board[1][2] = symbol;
		break;
		case 7:  board[2][0] = symbol;
		break;
		case 8:  board[2][1] = symbol;
		break;
		case 9: board[2][2] = symbol;
		break;
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
