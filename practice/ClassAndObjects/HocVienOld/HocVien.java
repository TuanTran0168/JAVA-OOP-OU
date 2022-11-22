package practice.ClassAndObjects.HocVienOld;

import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HocVien {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int SO_MON = 3;
    private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    private static int dem;
    
    private int maSoHocVien = ++dem;
    private String hoTen;
    private GregorianCalendar ngaySinh;
    private boolean gioiTinh;
    private String queQuan;
    private double[] diem;
    

    public HocVien(String hoTen, GregorianCalendar ngaySinh, boolean gioiTinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    public HocVien (String hoTen, String ngaySinh, boolean gioiTinh, String queQuan) throws ParseException {
        this.ngaySinh = new GregorianCalendar();
        this.ngaySinh.setTime(F.parse(ngaySinh));

        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
    }

    public void hienThi() {
        System.out.print("Ho va Ten: ");
        System.out.println(this.hoTen);
        System.out.print("Gioi tinh: ");
        System.out.println(this.gioiTinh);
        System.out.print("Ngay sinh: ");
        System.out.println(F.format(this.ngaySinh));
        System.out.print("Que quan: ");
        System.out.println(this.queQuan);
        System.out.println();

        if (diem != null) {
            System.out.print("Diem cac mon: ");
            for (int i = 0; i < SO_MON; i++) {
                System.out.printf("%.1f ", this.diem[i]);
            }
            System.out.println();
        }
    }

    public void nhapDiem () {
        diem = new double[SO_MON];
        System.out.println("Nhap diem hoc vien " + this.hoTen);
        for (int i = 0; i < SO_MON; i++) {
            this.diem[i] = scanner.nextDouble();
        }
    }

    public double diemTrungBinh() {
        double dTB = 0;
        for (int i = 0; i < SO_MON; i++) {
            dTB += diem[i];
        }
        return dTB;
    }
}
