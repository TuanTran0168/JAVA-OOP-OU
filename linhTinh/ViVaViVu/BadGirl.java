package linhTinh.ViVaViVu;

import java.util.Date;

public class BadGirl extends People{
    private String tuuLuong;

    public BadGirl(String name, int age, Date birthDate, String tuuLuong) {
        super(name, age, birthDate);
        this.tuuLuong = tuuLuong;
    }

    public BadGirl() {
        super();
        this.tuuLuong = "Tot";
    }

    public String getTuuLuong() {
        return tuuLuong;
    }

    public void setTuuLuong(String tuuLuong) {
        this.tuuLuong = tuuLuong;
    }
}
