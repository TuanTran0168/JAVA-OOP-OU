package practice.BasicJAVA;

import java.util.Scanner;

public class Demo5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int MAX_ROW = 100;
        final int MAX_COL = 100;
        int[][] array = new int[MAX_ROW][MAX_COL];
        int row, col;

        System.out.print("Nhap so dong: ");
        row = scanner.nextInt();
        System.out.print("Nhap so cot: ");
        col = scanner.nextInt();

        enterArray(array, row, col);
        printArray(array, row, col);

        int[] sumRowArray = new int[row];
        sumOfRow(array, row, col, sumRowArray);

        int[] sumColArray = new int[col];
        sumOfCol(array, row, col, sumColArray);

    }

    public static void enterArray(int[][] array, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhap phan tu o vi tri array[" + (i) + "][" + (j) + "]: ");
                array[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }

    public static void printArray(int[][] array, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfRow(int[][] array, int row, int col, int[] sumRowArray) {
        int count = 0; // how to truyền tham chiếu :v
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum = sum + array[i][j];
            }
            sumRowArray[count++] = sum;
        }
    }

    public static void sumOfCol(int[][] array, int row, int col, int[] sumColArray) {
        int count = 0;
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i > row; i++) {
                sum = sum + array[j][i];
            }
            sumColArray[count++] = sum;
        }
    }
    // End
}
