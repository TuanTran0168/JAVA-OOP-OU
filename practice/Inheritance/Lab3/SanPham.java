package practice.Inheritance.Lab3;

import java.util.Scanner;

public class SanPham {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static int dem = 0;
    private int maSanPham = ++dem;
    private String tenSanPham;
    private double giaBan;

    public String layTen() {
        return null;
    }

    public void nhapSanPham() {
        System.out.println("Loai san pham: " + this.layTen());
        System.out.print("Nhap ten: ");
        this.tenSanPham = SCANNER.nextLine();
        System.out.print("Nhap gia: ");
        this.giaBan = Double.parseDouble(SCANNER.nextLine());
    }

    public void hienThi() {
        System.out.println("Ma san pham: " + this.maSanPham);
        System.out.println("Loai san pham: " + this.layTen());
        System.out.println("Ten san pham: " + this.tenSanPham);
        System.out.printf("Gia ban: %.1f\n", this.giaBan);
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
}
