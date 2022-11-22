package practice.Inheritance.BaiBo;

public class TamGiac {
    private double a, b, c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double tinhNuaChuVi() {
        return (this.a + this.b + this.c) / 2;
    }

    public double tinhDienTich() {
        return Math.sqrt(this.tinhNuaChuVi() * (this.tinhNuaChuVi() - this.a) * (this.tinhNuaChuVi() - this.b)
                * (this.tinhNuaChuVi() - this.c));
    }

    public double tinhChuVi() {
        return this.tinhNuaChuVi() * 2;
    }

    public String layTen() {
        return "Hinh Tam Giac";
    }
    public void hienThi() {
        System.out.println(this.layTen());
        System.out.println("Dien tich: " + this.tinhDienTich());
        System.out.println("Chu vi: " + this.tinhChuVi());
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
