package practice.ClassAndObjects.PhanSo;

public class PhanSo {
    private int tuSo;
    private int mauSo;
    //private static int soLuongPhanSo;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
    }

    public PhanSo(int tSo, int mSo) {
        if (mSo != 0) {
            this.tuSo = tSo;
            this.mauSo = mSo;
        }
        else
            System.err.println("Khong hop le!!!");
    }

    public void hienThi() {
            if ((this.tuSo >= 0 && this.mauSo > 0) || (this.tuSo < 0 && this.mauSo < 0))
                System.out.print(this.tuSo + "/" + this.mauSo);
            else if (this.tuSo < 0 || this.mauSo < 0)
            System.out.print("-" + Math.abs(this.tuSo) + "/" + Math.abs(this.mauSo));
    }

    public int uocChungLonNhat() {
        int a = Math.abs(this.tuSo);
        int b = Math.abs(this.mauSo);

        while (a != b) {
            if (a > b)
                a -= b;
            else if (b > a)
                b -= a;
        }
        return a;
    }

    public PhanSo rutGonPhanSo() {
        int tu = this.tuSo / uocChungLonNhat();
        int mau = this.mauSo / uocChungLonNhat();

        return new PhanSo(tu, mau);
    }

    public PhanSo phepCongPhanSo(PhanSo pSo) {
        int tu = this.tuSo * pSo.mauSo + pSo.tuSo * this.mauSo;
        int mau = this.mauSo * pSo.mauSo;

        return new PhanSo(tu, mau).rutGonPhanSo();
    }

    public PhanSo phepTruPhanSo(PhanSo pSo) {
        int tu = this.tuSo * pSo.mauSo - pSo.tuSo * this.mauSo;
        int mau = this.mauSo * pSo.mauSo;

        return new PhanSo(tu, mau).rutGonPhanSo();
    }

    public PhanSo phepNhanPhanSo(PhanSo pSo) {
        int tu = this.tuSo * pSo.tuSo;
        int mau = this.mauSo * pSo.mauSo;

        return new PhanSo(tu, mau).rutGonPhanSo();
    }

    public PhanSo phepChiaPhanSo(PhanSo pSo) {
        int tu = this.tuSo * pSo.mauSo;
        int mau = this.mauSo * pSo.tuSo;

        return new PhanSo(tu, mau).rutGonPhanSo();
    }

    public int isSoSanh(PhanSo pSo) {
        if (this.tuSo * pSo.mauSo == this.mauSo * pSo.tuSo)
            return 0;
        else if (this.tuSo * pSo.mauSo > this.mauSo * pSo.tuSo)
            return 1;
        else
            return -1;
    }

    public void setTuSo(int tSo) {
        this.tuSo = tSo;
    }

    public int getTuSo() {
        return this.tuSo;
    }

    public void setMauSo(int mSo) {
        this.mauSo = mSo;
    }

    public int getMauSo() {
        return this.mauSo;
    }
}
