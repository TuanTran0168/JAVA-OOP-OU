package practice.ClassAndObjects.QuanLyHocVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class HocVien {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyy"); // Dinh dang chuoi Date
    private static final int SO_MON = 3;
    private static int dem;
    private int maHocVien = ++dem;
    private String tenHocVien;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String queQuan;
    private double[] diem;

    public HocVien(String tenHocVien, boolean gioiTinh, Date ngaySinh, String queQuan) {
        this.tenHocVien = tenHocVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public HocVien(String tenHocVien, boolean gioiTinh, String ngaySinh, String queQuan) throws ParseException {
        this.tenHocVien = tenHocVien;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;

        this.ngaySinh = myFormat.parse(ngaySinh); // Chuyen chuoi thanh Date
    }

    public void hienThi() {
        System.out.println("Ma hoc vien: " + this.maHocVien);
        System.out.println("Ho va ten: " + this.tenHocVien);

        System.out.print("Gioi tinh: ");
        if (this.gioiTinh == true)
            System.out.println("Nam");
        else
            System.out.println("Nu");

        System.out.println("Ngay sinh: " + myFormat.format(this.ngaySinh)); // Chuyen Date thanh chuoi
        System.out.println("Que quan: " + this.queQuan);

        if (this.diem != null) {
            System.out.print("Diem 3 mon:");
            for (double d : this.diem) {
                System.out.printf(" %.1f  ", d);
            }
            System.out.println();
            System.out.printf("Diem trung binh: %.1f \n", this.tinhDiemTB());
            // for (int i = 0; i < SO_MON; i++)
            // System.out.printf("%.2f", this.diem[i]);
        }

        System.out.println();
    }

    public void nhapDiem() {
        this.diem = new double[SO_MON];
        System.out.println("==> Nhap diem cho hoc vien: " + this.tenHocVien.toUpperCase());
        for (int i = 0; i < SO_MON; i++) {
            do {
                System.out.print("Nhap diem mon [" + (i + 1) + "]: ");

                this.diem[i] = scanner.nextDouble();
            } while (this.diem[i] < 0 || this.diem[i] > 10);
        }
        System.out.println();
    }

    public double tinhDiemTB() {

        return DoubleStream.of(this.diem).average().getAsDouble();

        // int tong = 0;
        // for (double diem : this.diem) {
        // tong += diem;
        // }
        // return tong/SO_MON;
    }

    public int soSanh(HocVien hocVien) {
        double dTB1 = this.tinhDiemTB();
        double dTB2 = hocVien.tinhDiemTB();

        return dTB1 > dTB2 ? 1 : (dTB1 < dTB2 ? -1 : 0);
    }

    public boolean isHocBong() {
        int tong = 0;

        for (double diem : this.diem) {
            if (diem < 5)
                return false;
            else
                tong += diem;
        }
        return tong / SO_MON >= 8;
    }

    public int getMaHocVien() {
        return this.maHocVien;
    }

    public String getTenHocVien() {
        return tenHocVien;
    }

    public void setTenHocVien(String tenHocVien) {
        this.tenHocVien = tenHocVien;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
                                                                                                                            