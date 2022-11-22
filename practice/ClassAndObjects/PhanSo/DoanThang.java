package practice.ClassAndObjects.PhanSo;

public class DoanThang {
    private Diem diemDau;
    private Diem diemCuoi;

    public DoanThang(Diem dDau, Diem dCuoi) {
        this.diemDau = dDau;
        this.diemCuoi = dCuoi;
    }

    public void hienThi() {
        System.out.printf("[(%.2f, %.3f), (%.3f, %.2f)]", this.diemDau.getHoanhDo(), this.diemDau.getTungDo(),
                this.diemCuoi.getHoanhDo(), this.diemCuoi.getTungDo());
    }

    public double doDai() {
        return this.diemDau.khoangCach(this.diemCuoi);
    }

    public Diem trungDiem() {
        double hoanhTrungDiem = ((this.diemDau.getHoanhDo() + this.diemCuoi.getHoanhDo()) / 2);
        double tungTrungDiem = ((this.diemDau.getTungDo() + this.diemCuoi.getTungDo()) / 2);
        Diem KQ = new Diem(hoanhTrungDiem, tungTrungDiem);
        return KQ;
    }

    public boolean isSongSong(DoanThang dt) {
        double vt = (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo()) * (dt.diemDau.getTungDo() - dt.diemCuoi.getTungDo());
        double vp = (this.diemDau.getTungDo() - this.diemCuoi.getTungDo()) * (dt.diemDau.getHoanhDo() - dt.diemCuoi.getHoanhDo());
        if (vt == vp)
            return true;
        return false;
    }

    public Diem getDiemDau() {
        return this.diemDau;
    }

    public void setDiemDau(Diem dDau) {
        this.diemDau = dDau;
    }

    public Diem getDiemCuoi() {
        return this.diemCuoi;
    }

    public void setDiemCuoi(Diem dCuoi) {
        this.diemCuoi = dCuoi;
    }
}