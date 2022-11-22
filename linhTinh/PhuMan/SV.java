package linhTinh.PhuMan;

public class SV {
	private String MSSV, Ho, Ten, Nganh, Que;
	private NgayThang NgaySinh;

	SV() {
		MSSV = Ho = Ten = Nganh = Que = "NULL";
		NgaySinh = new NgayThang(1, 1, 1900);
	}

	SV(String MSSVtam, String Hotam, String Tentam, long d, long m, long y, String Nganhtam, String Quetam) {
		MSSV = MSSVtam;
		Ho = Hotam;
		Ten = Tentam;
		NgaySinh = new NgayThang(d, m, y);
		Nganh = Nganhtam;
		Que = Quetam;
	}

	public boolean timTen(String khuondang) {
		if (Ten.startsWith(khuondang))
			return true;
		return false;
	}

	public boolean timHo(String khuondang) {
		if (Ho.startsWith(khuondang))
			return true;
		return false;
	}

	public boolean timMaSo(String khuondang) {
		if (MSSV.endsWith(khuondang))
			return true;
		return false;
	}

	public String GetQue() {
		return Que;
	}

	public String getHo() {
		return Ho;
	}

	public String toString() {
		String x = "MSSV: " + MSSV + "\n"
				+ "Ho Ten: " + Ho + " " + Ten + "\n"
				+ "Nganh: " + Nganh + "\n"
				+ "Que: " + Ho + " " + Ten + "\n"
				+ "Ngay sinh: " + NgaySinh + "\n";
		return x;
	}

	public String showName() {
		return this.Ten;
	}
}
