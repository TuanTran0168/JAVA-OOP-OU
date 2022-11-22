package practice.Inheritance.Lab4;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TaiKhoanCoKyHan extends TaiKhoan {
    private Calendar ngayDaoHan;
    private KyHan kyHan;

    public TaiKhoanCoKyHan(String tenTaiKhoan, BigDecimal soTien, KyHan kyHan) {
        super(tenTaiKhoan, soTien);
        this.kyHan = kyHan;

        this.ngayDaoHan = this.kyHan.tinhNgayDaoHan(new GregorianCalendar());
    }

    @Override
    public String toString() {
        return String.format("%sKy Han: %s\nNgay Dao Han: %s\n", super.toString(), this.kyHan,
                MY_DATE_FORMAT.format(this.ngayDaoHan.getTime()));
    }

    @Override
    public boolean isDaoHan() {
        // TODO Auto-generated method stub
        Calendar date = new GregorianCalendar();    //Ngày rút 
        String s1 = MY_DATE_FORMAT.format(date.getTime()); //Ngày rút 
        String s2 = MY_DATE_FORMAT.format(this.ngayDaoHan.getTime());   //Ngày đáo hạn 
        
        return s1.equals(s2);
    }

    public void capNhatNgayDaoHan() {
        this.ngayDaoHan = this.kyHan.tinhNgayDaoHan(this.ngayDaoHan);
    }

    @Override
    public BigDecimal tinhTienLai() {
        // TODO Auto-generated method stub
        return this.kyHan.tinhTienLai(this.soTien);
    }

    // @Override
    // public void napTien(BigDecimal soTienMuonNap) {
    // // TODO Auto-generated method stub
    // super.napTien(soTienMuonNap);
    // }

    // @Override
    // public void rutTien(BigDecimal soTienMuonRut) {
    // // TODO Auto-generated method stub
    // super.rutTien(soTienMuonRut);
    // }

    public KyHan getKyHan() {
        return kyHan;
    }

    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }
}
