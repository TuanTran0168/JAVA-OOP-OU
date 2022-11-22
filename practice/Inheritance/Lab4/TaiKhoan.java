package practice.Inheritance.Lab4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TaiKhoan {
    public static final SimpleDateFormat MY_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    public static int dem;
    protected String soTaiKhoan;
    protected String tenTaiKhoan;
    protected BigDecimal soTien;
    protected Date ngayTaoTaiKhoan;

    // Khối khởi động
    {
        this.setSoTaiKhoan(String.format("%05d", ++dem));
        this.ngayTaoTaiKhoan = new Date(); // Lấy tạm ngày hiện tại
    }

    public TaiKhoan(String tenTaiKhoan, BigDecimal soTien) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("So Tai Khoan: %s\nTen Tai Khoan: %s\nSo Tien: %.3f VND\nNgay Tao Tai Khoan: %s\n",
                this.soTaiKhoan, this.tenTaiKhoan, this.soTien, MY_DATE_FORMAT.format(this.ngayTaoTaiKhoan));
    }

    public void napTien(BigDecimal soTienMuonNap) {
        if(this.isDaoHan() == true) {
            this.soTien = this.soTien.add(soTienMuonNap);
        }
    }

    public void rutTien(BigDecimal soTienMuonRut) {
        if (this.isDaoHan() == true) {
            if (this.soTien.compareTo(soTienMuonRut) >= 0) {
                this.soTien = this.soTien.subtract(soTienMuonRut);
            }
        }
    }

    public BigDecimal tinhTienLai() {
        /* 
            12 thang -> 0.1% * soTien
            1 thang  -> ?
        */
        // Sử dụng divide(số bị chia, phần thập phân sau dấu phẩy, chế độ làm tròn)
        return this.soTien.multiply(new BigDecimal(0.001)).divide(new BigDecimal(12), 3, RoundingMode.HALF_UP);
    }

    public boolean isDaoHan() {
        return true;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public Date getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(Date ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public BigDecimal getSoTien() {
        return soTien;
    }

    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

}
