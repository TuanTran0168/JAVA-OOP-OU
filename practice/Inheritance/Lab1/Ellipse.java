package practice.Inheritance.Lab1;

public class Ellipse extends Hinh {
    private double banKinhTrucLon;
    private double banKinhTrucNho;
    
    Ellipse (double banKinhTrucLon, double banKinhTrucNho) {
        this.banKinhTrucLon = banKinhTrucLon;
        this.banKinhTrucNho = banKinhTrucNho;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinhTrucLon * banKinhTrucNho;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((Math.pow(banKinhTrucLon, 2) + Math.pow(banKinhTrucNho, 2)) / 2);
    }
    @Override
    public String layTen() {
        return "Hinh Ellipse";
    }

    @Override
    public void hienThi() {
        System.out.println(this.layTen());
        System.out.printf("Dien tich la: %.2f\n", this.tinhDienTich());
        System.out.printf("Chu Vi la: %.2f\n", this.tinhChuVi());
        System.out.println();
    }

    public double getBanKinhTrucLon() {
        return banKinhTrucLon;
    }

    public double getBanKinhTrucNho() {
        return banKinhTrucNho;
    }

    public void setBanKinhTrucNho(double banKinhTrucNho) {
        this.banKinhTrucNho = banKinhTrucNho;
    }

    public void setBanKinhTrucLon(double banKinhTrucLon) {
        this.banKinhTrucLon = banKinhTrucLon;
    }
    
}
