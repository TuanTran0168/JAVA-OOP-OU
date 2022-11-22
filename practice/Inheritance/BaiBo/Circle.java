package practice.Inheritance.BaiBo;

public class Circle extends Ellipse {
    private double banKinh;

    public Circle(double banKinh) {
        super(banKinh, banKinh);
    }

    public String layTen() {
        return "Hinh Cirlce";
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

}
