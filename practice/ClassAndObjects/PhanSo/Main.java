// package practice.ClassAndObjects.PhanSo;

// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         final int n = 3;
//         PhanSo1[] mangPhanSo = new PhanSo1[n];
//         Scanner scanner = new Scanner(System.in);

//         for (int i = 0; i < n; i++) {
//             System.out.print("Nhap tu so: ");
//             int tSo = scanner.nextInt();
           
//             System.out.print("Nhap mau so: ");
//             int mSo = scanner.nextInt();
            
//             mangPhanSo[i] = new PhanSo1(tSo, mSo);
//             System.out.println();
//         }

//         PhanSo1 tong = new PhanSo1();
//         for (int i = 0; i < n; i++) {
//             tong = tong.phepCongPhanSo(mangPhanSo[i]);
//         }
//         System.out.print("Tong cac phan so la: ");
//         tong.hienThi();

//         PhanSo1 max = new PhanSo1();
//     }
// }
