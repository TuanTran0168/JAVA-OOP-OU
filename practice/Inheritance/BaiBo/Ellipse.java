package practice.Inheritance.BaiBo;

public class Ellipse {
    private double banKinhLon;
    private double banKinhNho;

    public Ellipse(double banKinhLon, double banKinhNho) {
        this.banKinhLon = banKinhLon;
        this.banKinhNho = banKinhNho;
    }

    public double tinhDienTich() {
        return Math.PI * this.banKinhLon * this.banKinhNho;
    }

    public double tinhChuVi() {
        return 2 * Math.PI * Math.sqrt((Math.pow(this.banKinhLon, 2) + Math.pow(this.banKinhNho, 2)) / 2);
    }

    public String layTen() {
        return "Hinh Ellipse";
    }

    public void hienThi() {
        System.out.println(this.layTen());
        System.out.println("Dien tich: " + this.tinhDienTich());
        System.out.println("Chu vi: " + this.tinhChuVi());
    }

    public double getBanKinhLon() {
        return banKinhLon;
    }
    public double getBanKinhNho() {
        return banKinhNho;
    }
    public void setBanKinhNho(double banKinhNho) {
        this.banKinhNho = banKinhNho;
    }
    public void setBanKinhLon(double banKinhLon) {
        this.banKinhLon = banKinhLon;
    }  
}