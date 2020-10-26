package com.cybertek.arrays;

public class NinetyDegree {
    public static void main(String[] args) {
        int[][] square = {{1, 2, 3,4}, { 5, 6,7,8}, { 9,10,11,12},{13,14,15,16}};
        System.out.println("Initial condition of square");
        printSquare(square);

        System.out.println("After implementation of rotate method for clockwise");
        printSquare(rotateSquareClockWise(square));

        System.out.println("After implementation of rotate method for anti clockwise");
        printSquare(rotateSquareReverseOfClockWise(square));



    }

    static int[][] rotateSquareClockWise(int[][] square) {

        int rotatedSquareRows = square[0].length;
        int rotatedSquareColumns = square.length;

        int[][] rotatedSquare = new int[rotatedSquareRows][rotatedSquareColumns];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                rotatedSquare[j][rotatedSquareColumns - 1 - i] = square[i][j];
            }

        }

        return rotatedSquare;
    }

    static int [][] rotateSquareReverseOfClockWise(int [][] square){
        int rotatedSquareRows = square[0].length;
        int rotatedSquareColumns = square.length;

        int[][] rotatedSquare = new int[rotatedSquareRows][rotatedSquareColumns];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                rotatedSquare[rotatedSquareRows-1-j][i] = square[i][j];
            }

        }

        return rotatedSquare;
    }

    static void printSquare(int [][] matrix){

        for (int rotate[] : matrix) {
            for (int num : rotate) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


}
