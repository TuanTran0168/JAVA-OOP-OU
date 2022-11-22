package practice.Inheritance.Lab1;

public class HinhChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        // TODO Auto-generated method stub
        return this.chieuDai * this.chieuRong;
    }

    @Override
    public double tinhChuVi() {
        // TODO Auto-generated method stub
        return (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public String layTen() {
        // TODO Auto-generated method stub
        return "Hinh Chu Nhat";
    }

    @Override
    public void hienThi() {
        // TODO Auto-generated method stub
        System.out.println(this.layTen());
        System.out.printf("Dien tich la: %.2f\n", this.tinhDienTich());
        System.out.printf("Chu Vi la: %.2f\n", this.tinhChuVi());
        System.out.println();
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

}
