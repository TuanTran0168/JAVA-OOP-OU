package practice.Inheritance.Lab4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiKhoan {
    private List<TaiKhoan> danhSachTaiKhoan = new ArrayList<TaiKhoan>();

    public void themTaiKhoan(TaiKhoan taiKhoan) {
        this.danhSachTaiKhoan.add(taiKhoan);
    }

    public void hienThiDanhSach() {
        this.danhSachTaiKhoan.forEach(taiKhoan -> System.out.println(taiKhoan)); // Chỗ taiKhoan này auto gọi toString
                                                                                 // hoặc ghi tường minh
                                                                                 // taiKhoan.toString() cũng được
    }

    public List<TaiKhoan> getDanhSachTaiKhoan() {
        return danhSachTaiKhoan;
    }

    public void setDanhSachTaiKhoan(List<TaiKhoan> danhSachTaiKhoan) {
        this.danhSachTaiKhoan = danhSachTaiKhoan;
    }

}
