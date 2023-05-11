import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    public void testPrint(){
        Board b = new Board();
        b.setBoard();
        b.printBoard();
    }

    @Test
    public void testSetBoard(){
        Board b = new Board();
        b.setBoard();
    }

    @Test
    public void testInitBoard(){
        Board b = new Board();
    }

    @Test
    public void test2dPrint(){
        String matrix[][] = new String[][]{{"A", "B", "C"},{"D","E","F"},{"G","H","I"}};
        Board b = new Board();
        b.print2dMatrix(matrix,3);

    }
    @Test
    public void testTranspose(){
        String matrix[][] = new String[][]{{"A", "B", "C"},{"D","E","F"},{"G","H","I"}};
        Board b = new Board();
        b.print2dMatrix(matrix,3);

        String transpose[][] = b.transpose(matrix,3);
        String expected_transpose[][] = new String[][]{{"A", "D", "G"},{"B","E","H"},{"C","F","I"}};
        b.print2dMatrix(transpose,3);
    }

    @Test
    public void testOddEven(){
        Board b = new Board();
        int x = 7;
        assertTrue(b.isOdd(x));
        assertFalse(b.isEven(x));
        x = 8;
        assertFalse(b.isOdd(x));
        assertTrue(b.isEven(x));
    }



}