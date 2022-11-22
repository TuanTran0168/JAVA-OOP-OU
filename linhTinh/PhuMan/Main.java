package linhTinh.PhuMan;

import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<SV> sv = new ArrayList<>();

	static void DocFile() throws FileNotFoundException {
		File f = new File("E:\\VisualStudioCode\\JAVA\\linhTinh\\PhuMan\\SinhVien.txt");
		Scanner ip = new Scanner(f);
		while (ip.hasNext()) {
			String data = ip.nextLine();
			String[] kq = data.split(",");
			String[] b = kq[3].split("-");
			sv.add(new SV(kq[0], kq[1], kq[2], Long.parseLong(b[0]), Long.parseLong(b[1]), Long.parseLong(b[2]), kq[4],
					kq[5]));
		}

	}

	static void Nguyen() {
		for (SV x : sv) {
			if (x.timHo("Nguyen"))
				System.out.println(x);
		}
	}

	static void XoaN() {
		int i = 0;
		for (SV x : sv) {
			if (x.timHo("N")) {
				sv.remove(i);
			}
			i++;
		}
	}

	static ArrayList<SV> XoaN_1() {
		ArrayList<SV> temp = new ArrayList<>();

		for (SV x : sv) {
			if (!x.timHo("N")) {
				temp.add(x);
			}
		}

		return temp;
	}

	public static void main(String[] args) throws FileNotFoundException {
		DocFile();
		// sv.sort((SV sv1,SV sv2)->{
		// return -(sv1.getHo().compareTo(sv2.getHo()));
		// });
		XoaN();
		//sv = XoaN_1();
		for (SV x : sv)
			System.out.println(x);
	}

}
