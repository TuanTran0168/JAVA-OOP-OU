package practice.Polymorphism.QuanLyHinhHoc;

public abstract class Hinh {
    private String tenHinh;

    public Hinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public abstract double tinhDienTich();

    public abstract double tinhChuVi();

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Ten hinh: %s\nDien tich: %.2f\nChu vi: %.2f\n", this.tenHinh, this.tinhDienTich(),
                this.tinhChuVi());
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

}
