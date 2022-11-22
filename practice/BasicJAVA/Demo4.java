package practice.BasicJAVA;

// import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[100];
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        enterArray(array, n);
        printArray(array, n);
        System.out.println("Tong cac so nguyen to la: " + (sumPrimeNum(array, n)));

        if (maxPositiveNum(array, n) != 0)
            System.out.println("So duong lon nhat la: " + (maxPositiveNum(array, n)));
        else
            System.out.println("Khong co so duong");

        if (minNegativeNum(array, n) != 0)
            System.out.println("So am be nhat la: " + (minNegativeNum(array, n)));
        else
            System.out.println("Khong co so am");
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        else {
            if (num == 2)
                return true;
            else {
                if (num % 2 == 0)
                    return false;
                else
                    for (int i = 2; i < Math.sqrt(num); i++) {
                        if (num % i == 0)
                            return false;
                    }
            }
        }
        return true;
    }

    public static void enterArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu (" + (i) + "): ");
            array[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int sumPrimeNum(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int maxPositiveNum(int[] array, int n) {
        int maxNum = array[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > 0) {
                if (array[i] > maxNum) {
                    maxNum = array[i];
                    count++;
                }
            }
        }

        if (count == 0)
            return 0;
        return maxNum;
    }

    public static int minNegativeNum(int[] array, int n) {
        int minNum = array[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < 0) {
                if (array[i] < minNum) {
                    minNum = array[i];
                    count++;
                }
            }
        }

        if (count == 0)
            return 0;
        return minNum;
    }
}
