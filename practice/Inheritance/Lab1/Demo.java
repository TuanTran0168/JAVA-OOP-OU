package practice.Inheritance.Lab1;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception {
        Ellipse e1 = new Ellipse(5, 11);
        Ellipse e2 = new Ellipse(3, 9);
        Ellipse e3 = new Ellipse(7, 20);

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(9);
        Circle c3 = new Circle(11);

        TamGiac t1 = new TamGiac(3, 5, 7);
        TamGiacCan t2 = new TamGiacCan(6, 9);
        TamGiacDeu t3 = new TamGiacDeu(12);
        TamGiac t4 = new TamGiacCan(8, 3);
        TamGiac t5 = new TamGiacDeu(17);
        TamGiacCan t6 = new TamGiacDeu(17);

        HinhChuNhat hcn1 = new HinhChuNhat(5, 9);
        HinhChuNhat hcn2 = new HinhVuong(10);
        HinhVuong hcn3 = new HinhVuong(7);

        /*
         * Quan ly cac hinh khac nhau vao 1 danh sach
         * Sap xep tang dan theo dien tich
         * Sap xep giam dan theo ten, neu trung ten thi tang dan theo dien tich
         */

        /* ============================================ CACH 2 ============================================*/

        List<Hinh> danhSachHinh = new ArrayList<>();
        danhSachHinh.add(e1);
        danhSachHinh.add(e2);
        danhSachHinh.add(e3);
        danhSachHinh.add(c1);
        danhSachHinh.add(c2);
        danhSachHinh.add(c3);
        danhSachHinh.add(t1);
        danhSachHinh.add(t2);
        danhSachHinh.add(t3);
        danhSachHinh.add(t4);
        danhSachHinh.add(t5);
        danhSachHinh.add(t6);
        danhSachHinh.add(hcn1);
        danhSachHinh.add(hcn2);
        danhSachHinh.add(hcn3);

        danhSachHinh.forEach(hinh -> hinh.hienThi());


        System.out.println("=========================SAP XEP TANG THEO DIEN TICH======================");
        
        danhSachHinh.sort((hinh1, hinh2) -> {
            double dienTich1 = hinh1.tinhDienTich();
            double dienTich2 = hinh2.tinhDienTich();
            return dienTich1 > dienTich2 ? 1 : (dienTich1 < dienTich2 ? -1 : 0);
        });

        danhSachHinh.forEach(hinh -> hinh.hienThi());

        System.out.println("============ SAP XEP GIAM DAN THEO TEN, NEU TRUNG TEN THI TANG DAN THEO DIEN TICH ===============");

        danhSachHinh.sort((hinh1, hinh2) -> {

            if (hinh1.layTen().equals(hinh2.layTen())) {
                double dienTich1 = hinh1.tinhDienTich();
                double dienTich2 = hinh2.tinhDienTich();
                return dienTich1 > dienTich2 ? 1 : (dienTich1 < dienTich2 ? -1 : 0);
            }

            return -hinh1.layTen().compareTo(hinh2.layTen());
        });

        danhSachHinh.forEach(hinh -> hinh.hienThi());

        /* ============================================ CACH 1 ============================================ */

        // List<Object> ds = new ArrayList<>();
        // ds.add(e1);
        // ds.add(e2);
        // ds.add(e3);
        // ds.add(c1);
        // ds.add(c2);
        // ds.add(c3);
        // ds.add(t1);
        // ds.add(t2);
        // ds.add(t3);
        // ds.add(t4);
        // ds.add(t5);
        // ds.add(t6);

        // ds.forEach(hinh -> {
        //     if (hinh instanceof Ellipse) {
        //         ((Ellipse) hinh).hienThi();
        //     } else if (hinh instanceof TamGiac) {
        //         ((TamGiac) hinh).hienThi();
        //     }
        // });

        // System.out.println("=========================SAP XEP TANG THEO DIEN TICH======================");

        // ds.sort((hinh1, hinh2) -> {
        //     double dienTich1 = 0;
        //     if (hinh1 instanceof Ellipse) {
        //         dienTich1 = ((Ellipse) hinh1).tinhDienTich();
        //     } else {
        //         dienTich1 = ((TamGiac) hinh1).tinhDienTich();
        //     }

        //     double dienTich2 = 0;

        //     if (hinh2 instanceof Ellipse) {
        //         dienTich2 = ((Ellipse) hinh2).tinhDienTich();
        //     } else {
        //         dienTich2 = ((TamGiac) hinh2).tinhDienTich();
        //     }

        //     return dienTich1 > dienTich2 ? 1 : (dienTich1 < dienTich2 ? -1 : 0);
        // });

        // ds.forEach(hinh -> {
        //     if (hinh instanceof Ellipse) {
        //         ((Ellipse) hinh).hienThi();
        //     } else if (hinh instanceof TamGiac) {
        //         ((TamGiac) hinh).hienThi();
        //     }
        // });

        // System.out.println();
        // e1.hienThi();
        // e2.hienThi();
        // e3.hienThi();

        // System.out.println();
        // c1.hienThi();
        // c2.hienThi();
        // c3.hienThi();

        // System.out.println();
        // t1.hienThi();
        // t2.hienThi();
        // t3.hienThi();
        // t4.hienThi();
        // t5.hienThi();
        // t6.hienThi();
    }
}
