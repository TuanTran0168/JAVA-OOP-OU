package practice.Polymorphism.QuanLyHinhHoc;

public class Demo {
    public static void main(String[] args) {
        QuanLyHinh dSQuanLyHinh = new QuanLyHinh();
        Hinh h1 = new HinhChuNhat("Hinh Chu Nhat 1", 10, 8);
        Hinh h2 = new HinhVuong("Hinh Vuong 1", 5);
        Hinh h3 = new Ellipse("Ellipse", 9, 7);
        Hinh h4 = new HinhTron("Hinh Tron 1", 10);
        Hinh h5 = new TamGiac("Hinh Tam Giac 1", 3, 7, 9);
        Hinh h6 = new TamGiacCan("Hinh Tam Giac Can", 5, 7);
        Hinh h7 = new TamGiacDeu("Hinh Tam Giac Deu", 6);

        dSQuanLyHinh.themhHinh(h1);
        dSQuanLyHinh.themhHinh(h2);
        dSQuanLyHinh.themhHinh(h3);
        dSQuanLyHinh.themhHinh(h4);
        dSQuanLyHinh.themhHinh(h5);
        dSQuanLyHinh.themhHinh(h6);
        dSQuanLyHinh.themhHinh(h7);

        System.out.println("================== LAY THEO LOAI =====================");
        dSQuanLyHinh.timKiemTheoLoai("practice.Polymorphism.QuanLyHinhHoc.HinhChuNhat")
                .forEach(hinh -> System.out.println(hinh));

        System.out.println("================== GIAM THEO CHU VI =====================");
        dSQuanLyHinh.sapXepGiamTheoChuVi();
        dSQuanLyHinh.hienThi();

        System.out.println("================== ANG THEO DIEN TICH =====================");
        dSQuanLyHinh.sapXepTangTheoDienTich();
        dSQuanLyHinh.hienThi();

    }
}
