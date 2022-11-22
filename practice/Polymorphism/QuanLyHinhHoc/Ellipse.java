package practice.Polymorphism.QuanLyHinhHoc;

public class Ellipse extends Hinh {
    private double trucLon;
    private double trucNho;

    public Ellipse(String tenHinh, double trucLon, double trucNho) {
        super(tenHinh);
        this.trucLon = trucLon;
        this.trucNho = trucNho;
        //TODO Auto-generated constructor stub
    }

    @Override
    public double tinhDienTich() {
        // TODO Auto-generated method stub
        return Math.PI * this.trucLon * this.trucNho;
    }

    @Override
    public double tinhChuVi() {
        // TODO Auto-generated method stub
        return 2 * Math.PI * Math.sqrt((Math.pow(this.trucLon, 2) * Math.pow(this.trucNho, 2)) / 2);
    }

    public double getTrucNho() {
        return trucNho;
    }

    public void setTrucNho(double trucNho) {
        this.trucNho = trucNho;
    }

    public double getTrucLon() {
        return trucLon;
    }

    public void setTrucLon(double trucLon) {
        this.trucLon = trucLon;
    }
    
}
