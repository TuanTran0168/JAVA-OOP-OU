package practice.ClassAndObjects.PhanSo;

public class HinhChuNhat {
    private Diem diemTrenTrai;
    private Diem diemDuoiPhai;

    public HinhChuNhat (Diem tt, Diem dp) {
        if (tt.getHoanhDo() < dp.getHoanhDo() && tt.getTungDo() > dp.getTungDo()) {
            this.diemTrenTrai = tt;
            this.diemDuoiPhai = dp;
        }
        else
            System.err.println("\nKhong thoa dieu kien cua Hinh Chu Nhat");
    }

    public void hienThi() {
        System.out.println("\nDiem tren trai: ");
        diemTrenTrai.hienThi();
        System.out.println("\nDiem duoi phai: ");
        diemDuoiPhai.hienThi();
        System.out.println();
        System.out.println("Chieu dai: " + chieuDai());
        System.out.println("Chieu rong: " + chieuRong());
        System.out.println("Dien tich: " + dienTich());
        System.out.println("Chu vi: " + chuVi());
    }

    public Diem getDiemTrenTrai() {
        return this.diemTrenTrai;
    }
    
    public void setDiemTrenTrai(Diem tt) {
        this.diemTrenTrai = tt;
    }

    public Diem getDiemDuoiPhai() {
        return this.diemDuoiPhai;
    }

    public void setDiemDuoiPhai(Diem dp) {
        this.diemDuoiPhai = dp;
    }

    public double chieuDai() {
        return this.diemDuoiPhai.getHoanhDo() - this.diemTrenTrai.getHoanhDo();
    }

    public double chieuRong() {
        return this.diemTrenTrai.getTungDo() - this.diemDuoiPhai.getTungDo();
    }

    public double dienTich() {
        return chieuDai() * chieuRong();
    }
    public double chuVi() {
        return (chieuDai() + chieuRong()) * 2;
    }
}