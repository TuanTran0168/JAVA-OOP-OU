package practice.Inheritance.Lab4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.GregorianCalendar;

public enum KyHan {
    MOT_TUAN {
        @Override
        public Calendar tinhNgayDaoHan(Calendar current) {
            // TODO Auto-generated method stub

            current.add(Calendar.DAY_OF_YEAR, 7);
            return current;
        }

        @Override
        public BigDecimal tinhTienLai(BigDecimal soTien) {
            // TODO Auto-generated method stub
            /*
             * 365 ngay -> 0.5% * so tien
             * 7 ngay -> ?
             */
            Calendar calendar = new GregorianCalendar();
            int day = calendar.getActualMaximum(Calendar.DAY_OF_YEAR); // Lay so ngay trong nam (nhuan / khong nhuan)
            return (soTien.multiply(new BigDecimal(0.005)).multiply(new BigDecimal(7))).divide(new BigDecimal(day), 3,
                    RoundingMode.HALF_UP);
        }
    },
    MOT_THANG {
        @Override
        public Calendar tinhNgayDaoHan(Calendar current) {
            // TODO Auto-generated method stub

            current.add(Calendar.MONTH, 1);
            return current;
        }

        @Override
        public BigDecimal tinhTienLai(BigDecimal soTien) {
            // TODO Auto-generated method stub
            /*
             * 12 thang -> 4.5% * so tien
             * 1 thang -> ?
             */
            return soTien.multiply(new BigDecimal(0.045)).divide(new BigDecimal(12), 3, RoundingMode.HALF_UP);
        }
    },
    MOT_NAM {
        @Override
        public Calendar tinhNgayDaoHan(Calendar current) {
            // TODO Auto-generated method stub

            current.add(Calendar.YEAR, 1);
            return current;
        }

        @Override
        public BigDecimal tinhTienLai(BigDecimal soTien) {
            // TODO Auto-generated method stub
            /*
             * 1 nam -> 6.8%
             */
            return soTien.multiply(new BigDecimal(0.068));
        }
    };

    public abstract Calendar tinhNgayDaoHan(Calendar current);

    public abstract BigDecimal tinhTienLai(BigDecimal soTien);
}
