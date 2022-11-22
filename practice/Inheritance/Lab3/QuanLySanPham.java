package practice.Inheritance.Lab3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class QuanLySanPham {
    private List<SanPham> danhSachSanPham = new ArrayList<SanPham>();

    public void themSanPham(SanPham sanPham) {
        this.danhSachSanPham.add(sanPham);
    }

    public void themSanPham(String loaiSanPham) {
        /*CACH 2*/

        try {
            Class myClass = Class.forName(loaiSanPham);
            SanPham sanPham = (SanPham) myClass.getDeclaredConstructor(null).newInstance();
            sanPham.nhapSanPham();
            this.danhSachSanPham.add(sanPham);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        /*CACH 1*/ 
        // SanPham sanPham = null;

        // if (loaiSanPham.equals("Bang Dia")) {
        //     sanPham = new BangDia();
        // } else if (loaiSanPham.equals("Sach")) {
        //     sanPham = new Sach();
        // }

        // if (sanPham != null) {
        //     sanPham.nhapSanPham();
        //     this.danhSachSanPham.add(sanPham);
        // }
    }

    public List<SanPham> timKiem(String keyWord) {
        return this.danhSachSanPham.stream().filter(sanPham -> sanPham.getTenSanPham().contains(keyWord) == true)
                .toList();

        // return this.danhSachSanPham.stream().filter(sanPham ->
        // sanPham.getTenSanPham().contains(keyWord) == true)
        // .collect(Collectors.toList());
        // List <SanPham> ketQua = new ArrayList<SanPham>();
        // for (SanPham sanPham : this.danhSachSanPham) {
        // if (keyWord.contains(sanPham.getTenSanPham())) {
        // ketQua.add(sanPham);
        // }
        // }

        // return ketQua;
    }

    public List<SanPham> timKiemTheoLoai(String loaiSanPham) {
        return this.danhSachSanPham.stream().filter(sanPham -> {
            try {
                Class myClass = Class.forName(loaiSanPham);

                return myClass.isInstance(sanPham);
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // if (loaiSanPham.equals("Sach"))
            // return sanPham instanceof Sach;
            // else if (loaiSanPham.equals("BangDia"))
            // return sanPham instanceof BangDia;

            return false;

        }).toList();
    }

    public void sapXep() {
        this.danhSachSanPham.sort((sanPham1, sanPham2) -> {
            double gia1 = sanPham1.getGiaBan();
            double gia2 = sanPham2.getGiaBan();

            return -(gia1 > gia2 ? 1 : (gia1 < gia2 ? -1 : 0));
        });
    }

    public void hienThiDanhSach() {
        this.danhSachSanPham.forEach(sanPham -> sanPham.hienThi());
    }

    public List<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(List<SanPham> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}
