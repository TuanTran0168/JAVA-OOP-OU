package practice.ClassAndObjects.PhanSo;

public class PhanSo1 {
    private int tuSo;
    private int mauSo;

    public PhanSo1(int tSo, int mSo) {
        if (mSo != 0) {
            this.tuSo = tSo;
            this.mauSo = mSo;
        } else
            System.err.println("Khong hop le!!!");
    }

    public PhanSo1() {
        this(0, 1);
    }

    public void hienThi() {
        if ((this.tuSo >= 0 && this.mauSo > 0) || (this.tuSo < 0 && this.mauSo < 0))
            System.out.print(this.tuSo + "/" + this.mauSo);
        else if (this.tuSo < 0 || this.mauSo < 0)
            System.out.print("-" + Math.abs(this.tuSo) + "/" + Math.abs(this.mauSo));
    }

    public static int uocChungLonNhat(int a, int b) {
        if (a == 0 || b == 0)
            return 1;

        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b)
                a -= b;
            else if (b > a)
                b -= a;
        }
        return a;
    }

    public PhanSo1 rutGonPhanSo(int a, int b) {
        int tu = this.tuSo / uocChungLonNhat(a, b);
        int mau = this.mauSo / uocChungLonNhat(a, b);

        return new PhanSo1(tu, mau);
    }

    public PhanSo1 phepCongPhanSo(PhanSo1 pSo) {
        int tu = this.tuSo * pSo.mauSo + pSo.tuSo * this.mauSo;
        int mau = this.mauSo * pSo.mauSo;

        return new PhanSo1(tu, mau).rutGonPhanSo(tu, mau);
    }

    public PhanSo1 phepTruPhanSo(PhanSo1 pSo) {
        int tu = this.tuSo * pSo.mauSo - pSo.tuSo * this.mauSo;
        int mau = this.mauSo * pSo.mauSo;

        return new PhanSo1(tu, mau).rutGonPhanSo(tu, mau);
    }

    public PhanSo1 phepNhanPhanSo(PhanSo1 pSo) {
        int tu = this.tuSo * pSo.tuSo;
        int mau = this.mauSo * pSo.mauSo;

        return new PhanSo1(tu, mau).rutGonPhanSo(tu, mau);
    }

    public PhanSo1 phepChiaPhanSo(PhanSo1 pSo) {
        int tu = this.tuSo * pSo.mauSo;
        int mau = this.mauSo * pSo.tuSo;

        return new PhanSo1(tu, mau).rutGonPhanSo(tu, mau);
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
