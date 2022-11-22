package practice.Inheritance.Lab3;

public class Sach extends SanPham {
    private int soTrang;

    @Override
    public void nhapSanPham() {
        // TODO Auto-generated method stub
        super.nhapSanPham();

        System.out.print("Nhap so trang: ");
        this.soTrang = Integer.parseInt(SCANNER.nextLine());
        System.out.println();
    }

    @Override
    public void hienThi() {
        // TODO Auto-generated method stub
        super.hienThi();

        System.out.println("So trang: " + this.soTrang + " trang");
        System.out.println();
    }

    @Override
    public String layTen() {
        // TODO Auto-generated method stub
        return "Sach";
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
}
