package practice.Inheritance.Lab1;

public class TamGiac extends Hinh {
    private double canhA;
    private double canhB;
    private double canhC;

    public TamGiac(double canhA, double canhB, double canhC) throws Exception {
        if ((canhA + canhB > canhC) && (canhB + canhC > canhA) && (canhA + canhC > canhB)) {
            this.canhA = canhA;
            this.canhB = canhB;
            this.canhC = canhC;
        } else
            throw new Exception("Du lieu khong hop le");
    }

    @Override
    public double tinhDienTich() {
        // Cong thuc Hơ rông
        double p = this.tinhChuVi() / 2;
        return Math.sqrt(p * (p - this.canhA) * (p - this.canhB) * (p - this.canhC));
    }

    @Override
    public double tinhChuVi() {
        return this.canhA + this.canhB + this.canhC;
    }

    @Override
    public String layTen() {
        return "Hinh Tam Giac Thuong";
    }

    @Override
    public void hienThi() {
        System.out.println(this.layTen());
        System.out.printf("Dien tich la: %.2f\n", this.tinhDienTich());
        System.out.printf("Chu Vi la: %.2f\n", this.tinhChuVi());
        System.out.println();
    }

    public double getCanhA() {
        return canhA;
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

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

}
