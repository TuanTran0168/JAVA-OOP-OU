package practice.Inheritance.Lab3;

public class BangDia extends SanPham {
    private double doDaiPhat;

    @Override
    public void nhapSanPham() {
        // TODO Auto-generated method stub
        super.nhapSanPham();

        System.out.print("Nhap do dai phat: ");
        this.doDaiPhat = Double.parseDouble(SCANNER.nextLine());
        System.out.println();
    }

    @Override
    public void hienThi() {
        // TODO Auto-generated method stub
        super.hienThi();

        System.out.println("Do dai phat: " + this.doDaiPhat + " phut");
        System.out.println();
    }

    @Override
    public String layTen() {
        // TODO Auto-generated method stub
        return "Bang dia";
    }

    public double getDoDaiPhat() {
        return doDaiPhat;
    }

    public void setDoDaiPhat(int doDaiPhat) {
        this.doDaiPhat = doDaiPhat;
    }

}
