package linhTinh.Nhap.Nhap1;

public class ConCho extends ConVat {
    public String suaBay;

    public ConCho(String suaBay) {
        this.suaBay = suaBay;
    }

    public ConCho(String ten, String tiengKeu, String suaBay) {
        super(ten, tiengKeu);
        this.suaBay = suaBay;
    }
}
