package practice.ClassAndObjects.QuanLyHocVien;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLyHocVien {
    private List<HocVien> danhSachHocVien = new ArrayList<HocVien>();

    public void themHocVien(HocVien hocVien) {
        this.danhSachHocVien.add(hocVien);
    }

    public void hienThiDanhSach() {
        this.danhSachHocVien.forEach(hocVien -> hocVien.hienThi());
        // for (HocVien hocVien : danhSachHocVien) {
        // hocVien.hienThi();
        // }
    }

    public void docDanhSach(String duongDanURL) throws FileNotFoundException, ParseException {
        File myFile = new File(duongDanURL);

        try (Scanner scannerFile = new Scanner(myFile)) {
            while (scannerFile.hasNext()) {
                String tenHocVien = scannerFile.nextLine();
                String gioiTinhString = scannerFile.nextLine();

                boolean gioiTinh = false;
                if (gioiTinhString.contains("Nam"))
                    gioiTinh = true;
                else if (gioiTinhString.contains("Nu"))
                    gioiTinh = false;

                String ngaySinh = scannerFile.nextLine();
                String queQuan = scannerFile.nextLine();

                HocVien hocVien = new HocVien(tenHocVien, gioiTinh, ngaySinh, queQuan);
                this.danhSachHocVien.add(hocVien);
            }
        }
    }

    public void nhapDiemVaoDanhSach() {
        this.danhSachHocVien.forEach(hocVien -> hocVien.nhapDiem());

        // for (HocVien hocVien : this.danhSachHocVien) {
        // hocVien.nhapDiem();
        // }
    }

    public HocVien timKiem(int maHocVien) {

        return this.danhSachHocVien.stream().filter(hocVien -> hocVien.getMaHocVien() == maHocVien).findFirst().get();

        // for (HocVien hocVien : danhSachHocVien) {
        // if (hocVien.getMaHocVien() == maHocVien) {
        // return hocVien;
        // }
        // }
        // return null;
    }

    public List<HocVien> timKiem(String tuKhoa) {

        return this.danhSachHocVien.stream().filter(hocVien -> hocVien.getTenHocVien().contains(tuKhoa) == true
                || hocVien.getQueQuan().contains(tuKhoa) == true).collect(Collectors.toList());

        // List<HocVien> danhSachTimDuoc = new ArrayList<HocVien>();
        // for (HocVien hocVien : this.danhSachHocVien) {
        // if (hocVien.getTenHocVien().contains(tuKhoa) == true ||
        // hocVien.getQueQuan().contains(tuKhoa) == true) {
        // danhSachTimDuoc.add(hocVien);
        // }
        // }
        // return danhSachTimDuoc;
    }

    public void sapXepTheoDTB() {
        this.danhSachHocVien.sort((hocVien1, hocVien2) -> (hocVien1.soSanh(hocVien2))); //Sap xep tang
        //this.danhSachHocVien.sort((hocVien1, hocVien2) -> -(hocVien1.soSanh(hocVien2))); //Sap xep giam (Co dau tru truoc so sanh)
    }

    public List<HocVien> danhSachHocBong() {
        return this.danhSachHocVien.stream().filter(hocVien -> hocVien.isHocBong() == true).collect(Collectors.toList());
    }

    public static void xuatHocBong(String duongDanURL, List<HocVien> danhSachHocBong) throws FileNotFoundException {
        File myFile = new File(duongDanURL);
        try (PrintWriter printWriter = new PrintWriter(myFile)) {
            for (HocVien hocVien: danhSachHocBong) {
                printWriter.printf("%d - %s - %.1f\n", hocVien.getMaHocVien(), hocVien.getTenHocVien(), hocVien.tinhDiemTB());
            }
        }
    }

    public List<HocVien> getDanhSachHocVien() {
        return danhSachHocVien;
    }

    public void setDanhSachHocVien(List<HocVien> danhSachHocVien) {
        this.danhSachHocVien = danhSachHocVien;
    }
}
