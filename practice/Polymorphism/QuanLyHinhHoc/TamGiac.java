package practice.Polymorphism.QuanLyHinhHoc;

public class TamGiac extends Hinh {
    private double canhA;
    private double canhB;
    private double canhC;

    public TamGiac(String tenHinh, double canhA, double canhB, double canhC) {
        super(tenHinh);
       
        if (canhA + canhB > canhC || canhB + canhC > canhA || canhA + canhC > canhB) {
            this.canhA = canhA;
            this.canhB = canhB;
            this.canhC = canhC;
        }
        // TODO Auto-generated constructor stub
    }

    @Override
    public double tinhDienTich() {
        // TODO Auto-generated method stub
        double p = this.tinhChuVi() / 2;
        return Math.sqrt(p * (p - this.canhA) * (p - this.canhB) * (p - this.canhC));
    }

    @Override
    public double tinhChuVi() {
        // TODO Auto-generated method stub
        return this.canhA + this.canhB + this.canhC;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }
}
