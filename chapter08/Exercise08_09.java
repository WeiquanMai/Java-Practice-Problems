/**
 * @author Weiquan Mai
 * Problem 8.9
 * (Game: play a tic-tac-toe game)
 * In a game of tic-tac-toe, two players take turns marking an available cell in a 3 x 3 grid
 * with their respective tokens (either X or O). When one player has placed three tokens in a horizontal,
 * vertical, or diagonal row on the grid, the game is over, and that player has won.
 * A draw (no winner) occurs when all the cells on the grid have been filled with tokens
 * and neither player has achieved a win.
 * Create a program for playing a tic-tac-toe game.
 * The program prompts two players to alternately enter an X token or O token.
 * Whenever a token is entered, the program redisplays the board on the console
 * and determiens the status of the game (win, draw, or continue).
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exercise08_09 {
    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Variables
        int[][] board = new int[3][3];
        int numberOfTokens = 0;

        // Initiate board with 0's
        initiateBoard(board);

        // While continue
        while(numberOfTokens < 9){
            displayBoard(board);
            putUserToken(numberOfTokens, board, input);

            // Determine board status to see if player X or player O won
            if(boardStatus(board) == 3){
                System.out.println("X player won!");
                break;
            }
            else if(boardStatus(board) == -3){
                System.out.println("O player won!");
                break;
            }

            numberOfTokens++;
        }

        // Display final board
        System.out.println("Final Board: ");
        displayBoard(board);
        if(numberOfTokens == 9){
            System.out.println("Game was a tie!");
        }

        // Close Scanner
        input.close();
    }

    /**
     * Display the Tic-Tac-Toe board
     * @param board Two-dimensional array representing Tic-Tac-Toe board
     */
    public static void displayBoard(int[][] board){
        System.out.println("_____________");

        // Iterate through board and determine if X, O, or blank should be displayed
        for(int i = 0; i < board.length; i++){
            System.out.print("| ");
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    System.out.print("X");
                }
                else if(board[i][j] == -1){
                    System.out.print("O");
                }
                else{
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("_____________");
        }
    }

    /**
     * Obtain a valid position in Tic-Tac-Toe board and put in user token
     * @param numberOfTokens Current number of tokens on the board
     * @param board Two-dimensional array representing Tic-Tac-Toe board
     * @param input Scanner to obtain input
     */
    public static void putUserToken(int numberOfTokens, int[][] board, Scanner input){
        // Variables
        int playerX = 1;
        int playerO = -1;
        boolean validInput = false;

        // Determine if playerX or playerO
        String player = (numberOfTokens % 2 == 0) ? "player X" : "player O";
        int playerNumber = (numberOfTokens % 2 == 0) ? 1: -1;

        while(!validInput){
            // Prompt user to enter row and column
            System.out.print("Enter a row (0, 1, or 2) for " + player + ": ");
            int row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for " + player + ": ");
            int column = input.nextInt();

            // Input validation
            if(row < 0 || row > 2 || column < 0 || column > 2){
                System.out.println("Invalid input! Please enter 0, 1, or 2: ");
            }
            else if(!isValidPosition(row, column, board)){
                System.out.println("Invalid position! Spot taken!");
            }
            else{
                board[row][column] = playerNumber;
                validInput = true;
            }
        }
    }

    /**
     * Determines if the position on the board is valid
     * @param row Input row
     * @param column Input column
     * @param board Two-dimensional array representing Tic-Tac-Toe board
     * @return True if the input row and input column is valid, otherwise false
     */
    public static boolean isValidPosition(int row, int column, int[][] board){
        if(board[row][column] == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Initiates the board with 0's
     * @param board Two-dimensional array representing Tic-Tac-Toe board
     */
    public static void initiateBoard(int[][] board){
        for(int i = 0; i < board.length; i++){
            Arrays.fill(board[i], 0);
        }
    }


    /**
     * Determines if player X or player O won the game, or if it should continue
     * @param board Two-dimensional array representing Tic-Tac-Toe board
     * @return 3 representing player X win, -3 representing player O win, or 10 to represent continue
     */
    public static int boardStatus(int[][] board){
        // Variables
        int xWin = 3;
        int oWin = -3;

        // Diagonal check
        int counter = board[0][0] + board[1][1] + board[2][2];
        if(counter == xWin || counter == oWin){
            return counter;
        }
        counter = board[0][2] + board[1][1] + board[2][0];
        if(counter == xWin || counter == oWin){
            return counter;
        }

        // Horizontal check
        for(int i = 0; i < board.length; i++){
            counter = 0;
            for(int j = 0; j < board[i].length; j++){
                counter += board[i][j];

                if(counter == xWin || counter == oWin){
                    return counter;
                }
            }
        }

        // Vertical check
        for(int i = 0; i < board.length; i++){
            counter = 0;

            for(int j = 0; j < board[i].length; j++){
                counter += board[j][i];

                if(counter == xWin || counter == oWin){
                    return counter;
                }
            }
        }

        return 10;
    }
}
