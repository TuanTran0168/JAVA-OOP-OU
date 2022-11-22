package practice.Inheritance.Lab3;

public class VanPhongPham extends SanPham {
    private String congDung;

    @Override
    public String layTen() {
        // TODO Auto-generated method stub
        return "Van Phong Pham";
    }

    @Override
    public void hienThi() {
        // TODO Auto-generated method stub
        super.hienThi();

        System.out.println("Cong dung: " + this.congDung);
        System.out.println();
    }

    @Override
    public void nhapSanPham() {
        // TODO Auto-generated method stub
        super.nhapSanPham();

        System.out.println("Nhap cong dung: ");
        this.congDung = SCANNER.nextLine();
    }

    public String getCongDung() {
        return congDung;
    }

    public void setCongDung(String congDung) {
        this.congDung = congDung;
    }

}
