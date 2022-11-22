package practice.ClassAndObjects.PhanSo;

// import practice.ClassAndObjects.PhanSo;

public class Demo2 {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(6, -15);
        a.hienThi();
        System.out.println("\nUCLN = " + a.uocChungLonNhat());
        System.out.println("Rut gon = " + a.rutGonPhanSo().getTuSo() + "/" + a.rutGonPhanSo().getMauSo());
        System.out.println();
        PhanSo b = new PhanSo(8, 4);
        b.hienThi();
        System.out.println("\nUCLN = " + b.uocChungLonNhat());
        System.out.println("Rut gon = " + b.rutGonPhanSo().getTuSo() + "/" + b.rutGonPhanSo().getMauSo());

        System.out.println("\n================================= CACH 1 =======================================");
        System.out.println("Phep cong = " + (double) a.phepCongPhanSo(b).getTuSo() / a.phepCongPhanSo(b).getMauSo());
        System.out.println("Phep tru = " + (double) a.phepTruPhanSo(b).getTuSo() / a.phepTruPhanSo(b).getMauSo());
        System.out.println("Phep nhan = " + (double) a.phepNhanPhanSo(b).getTuSo() / a.phepNhanPhanSo(b).getMauSo());
        System.out.println("Phep chia = " + (double) a.phepChiaPhanSo(b).getTuSo() / a.phepChiaPhanSo(b).getMauSo());

        System.out.println("\n================================= CACH 2 =======================================");
        System.out.print("Cong = ");
        a.phepCongPhanSo(b).hienThi();
        System.out.print("\nTru = ");
        a.phepTruPhanSo(b).hienThi();
        System.out.print("\nNhan = ");
        a.phepNhanPhanSo(b).hienThi();
        System.out.print("\nChia = ");
        a.phepChiaPhanSo(b).hienThi();
        System.out.println("\n\n========================================================================");

        PhanSo c = new PhanSo(3, 1);
        PhanSo d = new PhanSo(6, 10);
        System.out.print("So sanh giua Phan So A = ");
        c.hienThi();
        System.out.print(" va Phan So B = ");
        d.hienThi();

        int kQSoSanh = c.isSoSanh(d);
        // System.out.println("\n" + kQSoSanh);
        if (kQSoSanh == 0)
            System.out.println("\nPhan so BANG NHAU!");
        else if (kQSoSanh == 1)
            System.out.println("\nPhan so A LON HON phan so B");
        else if (kQSoSanh == -1)
            System.out.println("\nPhan so A BE HON phan so B");
        else
            System.err.println("\n????");

    
        System.out.println();
    }
}
