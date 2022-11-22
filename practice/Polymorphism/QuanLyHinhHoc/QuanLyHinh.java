package practice.Polymorphism.QuanLyHinhHoc;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHinh {
    private List<Hinh> danhSachHinh = new ArrayList<>();

    public void themhHinh(Hinh hinh) {
        this.danhSachHinh.add(hinh);
    }

    public void xoaHinh(Hinh hinh) {
        this.danhSachHinh.remove(hinh);
    }

    public List<Hinh> timKiemTheoLoai(String url) {
        List<Hinh> temp = new ArrayList<>();

        try {
            Class c = Class.forName(url);

            for (Hinh hinh : this.danhSachHinh) {
                if (c.isInstance(hinh)) {
                    temp.add(hinh);
                }
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return temp;
    }

    public int soSanhDienTich(Hinh hinh1, Hinh hinh2) {
        double dienTich1 = hinh1.tinhDienTich();
        double dienTich2 = hinh2.tinhDienTich();

        return dienTich1 > dienTich2 ? 1 : (dienTich1 < dienTich2 ? -1 : 0);
    }

    public int soSanhChuVi(Hinh hinh1, Hinh hinh2) {
        double chuVi1 = hinh1.tinhChuVi();
        double chuVi2 = hinh2.tinhChuVi();

        return chuVi1 > chuVi2 ? 1 : (chuVi1 < chuVi2 ? -1 : 0);
    }

    public void sapXepTangTheoDienTich() {
        this.danhSachHinh.sort((hinh1, hinh2) -> {
            return soSanhDienTich(hinh1, hinh2);
        });
    }

    public void sapXepGiamTheoChuVi() {
        this.danhSachHinh.sort((hinh1, hinh2) -> {
            return -soSanhChuVi(hinh1, hinh2);
        });
    }

    public void hienThi() {
        this.danhSachHinh.forEach(hinh -> System.out.println(hinh));
    }

    public List<Hinh> getDanhSachHinh() {
        return danhSachHinh;
    }

    public void setDanhSachHinh(List<Hinh> danhSachHinh) {
        this.danhSachHinh = danhSachHinh;
    }
}
