package practice.Inheritance.Lab4;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

public class Demo {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan("Nguyen Van A", new BigDecimal(500000000));
        tk1.napTien(new BigDecimal(500000.5));

        TaiKhoan tk2 = new TaiKhoanCoKyHan("Tran Thi B", new BigDecimal(1150000000), KyHan.MOT_TUAN);
        tk2.napTien(new BigDecimal(50000000));

        TaiKhoan tk3 = new TaiKhoanCoKyHan("Tran Van C", new BigDecimal(300000000), KyHan.MOT_THANG);
        tk3.napTien(new BigDecimal(999));

        TaiKhoanCoKyHan tk4 = new TaiKhoanCoKyHan("Nguyen Thi D", new BigDecimal(800500000), KyHan.MOT_NAM);
        tk4.setNgayDaoHan(new GregorianCalendar());
        tk4.rutTien(new BigDecimal(600000));

        TaiKhoanCoKyHan tk5 = new TaiKhoanCoKyHan("Vo Van E", new BigDecimal(900000000), KyHan.MOT_THANG);
        tk5.setNgayDaoHan(new GregorianCalendar());
        tk5.rutTien(new BigDecimal(29949999));

        TaiKhoanCoKyHan tk6 = new TaiKhoanCoKyHan("Chau Thi F", new BigDecimal(450000000), KyHan.MOT_TUAN);
        tk6.setNgayDaoHan(new GregorianCalendar());
        tk6.napTien(new BigDecimal(666666));
        

        QuanLyTaiKhoan quanLy = new QuanLyTaiKhoan();
        quanLy.themTaiKhoan(tk1);
        quanLy.themTaiKhoan(tk2);
        quanLy.themTaiKhoan(tk3);
        quanLy.themTaiKhoan(tk4);
        quanLy.themTaiKhoan(tk5);
        quanLy.themTaiKhoan(tk6);

        quanLy.hienThiDanhSach();

        System.out.println("============================= TIEN LAI ==============================");
       
        quanLy.getDanhSachTaiKhoan().forEach(taiKhoan -> {
            System.out.printf("So tien lai cua - %s - la: %.3f\n", taiKhoan.tenTaiKhoan, taiKhoan.tinhTienLai());
        });

        System.out.println();
    }
}
