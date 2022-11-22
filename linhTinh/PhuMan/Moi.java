package linhTinh.PhuMan;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Moi {
	static final int MAX = 100;
	static DaThuc[] dt = new DaThuc[MAX];
	static int Dem = 0;

	static void DocFile() throws FileNotFoundException {
		File f = new File("E:\\VisualStudioCode\\JAVA\\linhTinh\\PhuMan\\ThayDat.txt");
		// E:\\VisualStudioCode\\JAVA\\linhTinh\\PhuMan\\Thay_Dat.txt
		Scanner ip = new Scanner(f);
		
		while (ip.hasNext()) {
			String data = ip.next();
			data.replace("\uFEFF", "");
			data.replace("\uEFBBBF", "");
			data.replace("\uFFFE", "");
			data.replace("\uFFFE0000", "");
			data.replace("\u0000FEFF", "");
			String[] a = data.split(",");
		
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			// double a1 = Double.parseDouble(a[0]);
			
			// double a2 = Double.parseDouble(a[1]);
			
			// double a3 = Double.parseDouble(a[2]);
			
			
			
			//dt[Dem++] = new DaThuc(a1, a2, a3);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		DocFile();

		System.out.println("In va Giai Phuong Trinh");
		for (int i = 0; i < Dem; i++) {
			System.out.println(dt[i]);
			String[] kq = dt[i].GiaiPhuongTrinh();
			for (String x : kq)
				System.out.println(x);
		}

	}

}
