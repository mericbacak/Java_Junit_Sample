package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] myNumbers = { {1,2,3,4,5,6,7},{8,9,10} };
        for (int i = 0; i < myNumbers.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < myNumbers[i].length; j++) { //this equals to the column in each row.
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }

}