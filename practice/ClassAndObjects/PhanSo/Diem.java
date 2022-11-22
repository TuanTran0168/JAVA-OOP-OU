package practice.ClassAndObjects.PhanSo;

public class Diem {
    private double hoanhDo;
    private double tungDo;

    public Diem(double hoanh, double tung) {
        this.hoanhDo = hoanh;
        this.tungDo = tung;
    }

    public void hienThi() {
        //System.out.println("println: (" + this.hoanhDo + "),(" + this.tungDo + ")");
        System.out.printf("(%.2f, %.5f)", this.hoanhDo, this.tungDo);
    }

    public double khoangCach(Diem b) {
        return Math.sqrt(Math.pow(this.hoanhDo - b.hoanhDo, 2) + Math.pow(this.tungDo - b.tungDo, 2));
    }

    public double getHoanhDo() {
        return this.hoanhDo;
    }

    public void setHoanhDo(double hoanh) {
        this.hoanhDo = hoanh;
    }

    public double getTungDo() {
        return this.tungDo;
    }

    public void setTungDo(double tung) {
        this.tungDo = tung;
    }
}