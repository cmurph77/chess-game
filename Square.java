public class Square {
    int row;
    int column;



    boolean white;



    boolean black;

    Square(int x,int y){
         row = x;
         column = y;
         black = false;
         white = false;
    }

    // returns black=1, white=0 , empty =-1
    public int getColour(){
        if(black) return 1;
        else if (white) return 0;
        else return -1;
    }

    public boolean isBlack() { return black; }

    public void setBlack() { black = true; }

    public boolean isWhite() { return white;}

    public void setWhite( ){ white = true; }

    public boolean isEmpty(){
        if(black ==false && white == false){
            return true;
        } else return false;
    }

}
