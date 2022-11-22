package practice.BasicJAVA;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap bac cua da thuc: ");
        int n = scanner.nextInt();
        System.out.print("Nhap x: ");
        int x = scanner.nextInt();
        System.out.println();
        int KQ = 0;
        for(int i = 0; i < n + 1; i++)
        {
            System.out.print("Nhap he so thu (" + (i) + "): ");
            int a = scanner.nextInt();
            KQ = (int)(KQ + (a * Math.pow(x, i)));
        }
        System.out.println("Dap an la: " + KQ);

        scanner.close();
    }
}
