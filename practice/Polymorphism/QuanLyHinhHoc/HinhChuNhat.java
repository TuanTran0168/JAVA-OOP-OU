package practice.Polymorphism.QuanLyHinhHoc;

public class HinhChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(String tenHinh, double chieuDai, double chieuRong) {
        super(tenHinh);

        if (chieuDai >= chieuRong) {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }

    @Override
    public double tinhChuVi() {
        // TODO Auto-generated method stub
        return (this.chieuDai * this.chieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        // TODO Auto-generated method stub
        return this.chieuDai * this.chieuRong;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
