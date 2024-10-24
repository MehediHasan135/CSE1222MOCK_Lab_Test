package Q2;

import java.util.ArrayList;

public class Runner2 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.set(0,0,"First cell");
        matrix.set(1,1,"Center cell");
        matrix.set(2,2,"Last cell");

        System.out.println("description at (0,0): "+ matrix.get(0,0));
        System.out.println("description at (1,1): "+ matrix.get(1,1));
        System.out.println("description at (2,2): "+ matrix.get(2,2));

        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCells();
        System.out.println("Described Cells: ");
        for(Matrix.Cell cell : describedCells){
            System.out.println(cell);
        }
    }
}
