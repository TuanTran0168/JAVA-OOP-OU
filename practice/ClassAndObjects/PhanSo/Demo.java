package practice.ClassAndObjects.PhanSo;

// import practice.ClassAndObjects.Diem;
// import practice.ClassAndObjects.DoanThang;
// import practice.ClassAndObjects.HinhChuNhat;
// Nằm cùng cấp 1 folder nên không cần import

public class Demo {
    public static void main(String[] args) {
        double hoanh = 5;
        double tung = 10;
        Diem diemACau1 = new Diem(hoanh, tung);
        Diem diemBCau1 = new Diem(3, 15);
        System.out.println("\nHoanh do lay tu ben ngoai: " + diemACau1.getHoanhDo());
        diemACau1.hienThi();
        System.out.println("\nKhoang cach giua 2 diem la: " + diemACau1.khoangCach(diemBCau1));

        System.out.println("\n============================================================================");

        Diem diemDau = new Diem(10, 10);
        Diem diemCuoi = new Diem(10, 10);
        DoanThang doanACau2 = new DoanThang(diemDau, diemCuoi);

        System.out.print("Doan thang: ");
        doanACau2.hienThi();
        System.out.println("\nDo dai: " + doanACau2.doDai());

        System.out.println("\nCach 1: ");
        System.out.println("Trung diem la: (" + doanACau2.trungDiem().getHoanhDo() + "),("
                + doanACau2.trungDiem().getTungDo() + ")");
        System.out.printf("Trung diem printf = (%.5f, %.5f)\n", doanACau2.trungDiem().getHoanhDo(),
                doanACau2.trungDiem().getTungDo());

        System.out.println("\nCach 2: ");
        doanACau2.trungDiem().hienThi();

        System.out.println();
        DoanThang doanBCau2 = new DoanThang(new Diem(10, 10), new Diem(10, 10));
        doanBCau2.hienThi();

        System.out.println("\nSong song: " + doanACau2.isSongSong(doanBCau2));

        System.out.println("\n============================================================================");
        Diem diemTT = new Diem(1, 3);
        Diem diemDP = new Diem(7, 2);
        HinhChuNhat hcn = new HinhChuNhat(diemTT, diemDP);
        hcn.hienThi();


    }
}
