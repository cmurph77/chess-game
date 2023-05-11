import java.util.ArrayList;
import java.util.Arrays;

public class Board {

    static final int dimension = 8;
    Square[][] board;

    Board(){
        board = new Square[dimension+1][dimension+1]; // create a 2d array of squares - the plus one is to account for 0th element
        initBoard();
    }

    public void initBoard(){
        for(int x = 1; x <= dimension;x++){
            for(int y = 1; y<= dimension;y++){
                //System.out.println("x: " + x + ", y: " + y);
                Square current = new Square(x,y);
                board[x][y] = current;
            }
        }
    }



    public void setBoard(){

        System.out.println("setting black");
        // set blacks position (1,1) -> (8,2)
        for(int y = 1; y <= 3;y++){
            for(int x = 1; x< dimension+1;x++){
                System.out.println("x: " + x + ", y: " + y);
                Square current = board[x][y];
                if((isEven(x) && isOdd(y))||(isOdd(x) && isEven(y))) {
                    current.setBlack();
                }
            }
        }

        //System.out.println("\nsetting white");
        //  set whites position (1,7) -> (8,8)
        for(int y = 6; y <= 8;y++){
            for(int x = 1; x<= dimension;x++){
                //System.out.println("x: " + x + ", y: " + y);
                Square current = board[x][y];
                if(  (isOdd(x) && isOdd(y)) || (isEven(x)&&isEven(y)) ){
                    current.setWhite();
                }
            }
        }
    }

    public void printBoard() {
        String field[][] = new String[dimension+1][dimension+1];

        for(int x = 0; x < dimension+1;x++){
            for(int y = 0; y < dimension+1;y++){
                //System.out.println("x: " + x + ", y: " + y);
                Square s = board[x][y];
                if(x>0 && y > 0){
                    if (s.isWhite()) field[x][y] = "W";
                    if (s.isBlack()) field[x][y] = "B";
                    if (s.isEmpty()) field[x][y] = " ";
                } else field[x][y] = "*";
            }
        }
        String [][] transpose = transpose(field,dimension+1);
        print2dMatrix(transpose,dimension+1);

    }
    public void print2dMatrix(String[][] matrix, int width){
        for(int i = 0; i< width;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public String[][] transpose(String[][] matrix,int size){
        String transpose[][] = new String[size][size];
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        return  transpose;
    }

    public boolean isOdd(int num){
        if(num % 2 == 0) return false;
        else return true;
    }

    public boolean isEven(int num){
        if(num % 2 != 0) return false;
        else return true;
    }

}
