package practice.ClassAndObjects.QuanLyHocVien;
// import practice.ClassAndObjects.QuanLyHocVien.HocVien;

// import practice.ClassAndObjects.QuanLyHocVien.QuanLyHocVien;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        final Scanner scanner = new Scanner(System.in);
        HocVien hV1 = new HocVien("Nguyen Van A", true, "1/1/1999", "Ho Chi Minh");
        HocVien hV2 = new HocVien("Tran Thi B", false, "23/7/2000", "Ninh Binh");
        HocVien hV3 = new HocVien("Ngo Ba K", true, "13/6/1997", "Hai Duong");
        Date nS = new Date();
        HocVien hV4 = new HocVien("Chau Thien Bao", true, nS, "Quang Ngai");

        QuanLyHocVien quanLy = new QuanLyHocVien();
        quanLy.themHocVien(hV1);
        quanLy.themHocVien(hV2);
        quanLy.themHocVien(hV3);
        quanLy.themHocVien(hV4);

        String duongDanURL =
        "E:\\VisualStudioCode\\JAVA\\practice\\ClassAndObjects\\QuanLyHocVien\\HocVien.txt"; //text
        quanLy.docDanhSach(duongDanURL);
        System.out.println("======================== DANH SACH CHUA NHAP DIEM ======================\n");
        quanLy.hienThiDanhSach();

        // System.out.println("======================== NHAP DIEM ======================\n");
        // quanLy.nhapDiemVaoDanhSach();

        System.out.println("======================== DANH SACH DA NHAP DIEM ======================\n");
        quanLy.hienThiDanhSach();

        System.out.println("======================== TIM KIEM ======================\n");
        System.out.print("Nhap ma hoc vien can tim: ");
        int maHocVien = scanner.nextInt();
        System.out.println();

        HocVien hV5 = quanLy.timKiem(maHocVien);
        hV5.hienThi();

        System.out.println("======================== TIM KIEM DANH SACH ======================\n");
        scanner.nextLine();
        System.out.print("Nhap tu khoa: ");
        String tuKhoa = scanner.nextLine();
        System.out.println();

        List<HocVien> dSTimKiem = quanLy.timKiem(tuKhoa);
        dSTimKiem.forEach(hocVien -> hocVien.hienThi());
        // for (HocVien hocVien : dSTimKiem) {
        // hocVien.hienThi();
        // }

        System.out.println("======================== SAP XEP ======================\n");
        quanLy.sapXepTheoDTB();
        quanLy.hienThiDanhSach();

        System.out.println("======================== DANH SACH HOC BONG ======================\n");
        List<HocVien> dSHocBong = quanLy.danhSachHocBong();
        dSHocBong.forEach(hocVien -> hocVien.hienThi());

        String duongDanURL1 = "D:\\VisualStudioCode\\JAVA\\practice\\ClassAndObjects\\QuanLyHocVien\\HocBong.txt";
        QuanLyHocVien.xuatHocBong(duongDanURL1, dSHocBong); //Phuong thuc static nen goi duoc bang ten Class luon

        scanner.close();
    }
}
