package practice.Inheritance.Lab3;

public class Demo {
    public static void main(String[] args) {
        SanPham sp1 = new BangDia();
        sp1.nhapSanPham();
       
        SanPham sp2 = new Sach();
        sp2.nhapSanPham();
       
        SanPham sp3 = new BangDia();
        sp3.nhapSanPham();
    
        SanPham sp4 = new Sach();
        sp4.nhapSanPham();

        SanPham sp5 = new VanPhongPham();
        sp5.nhapSanPham();

        QuanLySanPham quanLy = new QuanLySanPham();
        quanLy.themSanPham(sp1);
        quanLy.themSanPham(sp2);
        quanLy.themSanPham(sp3);
        quanLy.themSanPham(sp4);
        quanLy.themSanPham(sp5);
        quanLy.themSanPham("practice.KeThua.Lab3.VanPhongPham");
    
        quanLy.hienThiDanhSach();

        System.out.println("================= TIM KIEM =================");

        quanLy.timKiem("Doraemon").forEach(sP -> sP.hienThi());

        System.out.println("================= SAP XEP GIAM DAN THEO GIA =================");

        quanLy.sapXep();
        quanLy.hienThiDanhSach();

        System.out.println("================= SAN PHAM THEO LOAI =================");

        quanLy.timKiemTheoLoai("practice.KeThua.Lab3.VanPhongPham").forEach(sP -> sP.hienThi());

    }
}
