package pl.pk.java.basic;

import java.util.Random;


	

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- SAMOUCZEK TABLICE ---");
        practice.displayOneDimensionBoard();
    }
}

public class Practice {

    public int[] displayOneDimensionBoard() {
        int[] oneDimensionBoard = new int[8];
        int result = 0;
        Random random = new Random();
        for (int i = 0; i < oneDimensionBoard.length; i++) {
            oneDimensionBoard[i] = random.nextInt(40);
            System.out.print(oneDimensionBoard[i] + "|");
            result = result + oneDimensionBoard[i];
        }
        System.out.println();
        System.out.println("Result = " + result);
        return oneDimensionBoard;
    }
	
	
	
	
	
	
	
	
	
	
	
	

