package linhTinh.PhuMan;

public class DaThuc {
	private double a, b, c;

	public DaThuc() {
		a = b = c = 0;
	}

	public DaThuc(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
	}

	public double GiaTriDaThuc(double x) {
		return a * x * x + b * x + c;
	}

	public DaThuc CongDaThuc(DaThuc f) {
		return new DaThuc(a + f.a, b + f.b, c + f.c);
	}

	public static DaThuc CongDaThuc(DaThuc f, DaThuc g) {
		return new DaThuc(f.a + g.a, f.b + g.b, f.c + g.c);
	}

	public DaThuc NhanSoThuc(double k) {
		return new DaThuc(a * k, b * k, c * k);
	}

	public String[] GiaiPhuongTrinh() {
		if (a == 0)
			if (b == 0)
				if (c == 0) {
					String[] ketqua = new String[1];
					ketqua[0] = "Phuong trinh vo so nghiem";
					return ketqua;
				} else {
					String[] ketqua = new String[1];
					ketqua[0] = "Phuong trinh vo nghiem";
					return ketqua;
				}
			else {
				String[] ketqua = new String[1];
				ketqua[0] = Double.toString(-c / b);
				return ketqua;
			}
		else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				String[] ketqua = new String[1];
				ketqua[0] = "Phuong trinh vo nghiem";
				return ketqua;
			} else {
				String[] ketqua = new String[2];
				ketqua[0] = "x1= " + Double.toString((-b + Math.sqrt(delta)) / 2 / a);
				ketqua[1] = "x2= " + Double.toString((-b - Math.sqrt(delta)) / 2 / a);
				return ketqua;
			}
		}
	}

	public DaThuc DaoHam() {
		return new DaThuc(0, 2 * a, b);
	}

	public static DaThuc DaoHam(DaThuc f) {
		return new DaThuc(0, 2 * f.a, f.b);
	}

	public String toString() {
		return a + "x^2+" + b + "x+" + c;
	}
}

/*
 * //Cho da thuc f(x)=2x2+4 -9
 * DaThuc f= new DaThuc(2,4,-9);
 * System.out.println("f(x)= "+f);
 * System.out.println("f(0) = "+f.GiaTriDaThuc(0));
 * //Gan lai da thuc f va tao da thuc g nhu sau
 * //f(x)= x2 -4
 * //g(x)= x2 + 5x -6
 * f= new DaThuc(1,0,-4);
 * DaThuc g= new DaThuc(1,5,-6);
 * System.out.println("f(x)= "+f);
 * System.out.println("g(x)= "+g);
 * double f0= f.GiaTriDaThuc(0);
 * //Tinh gia tri f(0) va g(-2)
 * System.out.println("f(0)= "+f0);
 * System.out.println("g(-2)= "+g.GiaTriDaThuc(-2));
 * //In ra dao ham cua g
 * System.out.println("g'(x)= "+g.DaoHam());
 * //In ra gia tri g'(0)
 * System.out.println("g'(0)= "+(g.DaoHam()).GiaTriDaThuc(0));
 * 
 * //Tinh h(x)= f(x)+g(x)
 * DaThuc h= DaThuc.CongDaThuc(f, g);
 * System.out.println("f(x)+ g(x)= "+h);
 * //Tinh f(g(-1)) v� g(f(2))
 * System.out.println("f(g(-1)) = "+f.GiaTriDaThuc(g.GiaTriDaThuc(-1)));
 * System.out.println("g(f(2)) = "+g.GiaTriDaThuc(f.GiaTriDaThuc(2)));
 * //Tinh g(x)-f(x)
 * DaThuc m= f.NhanSoThuc(-1);
 * DaThuc n = DaThuc.CongDaThuc(g, m);
 * System.out.println("g(x)-f(x)= "+n);
 * //4f(x)-2g(x)
 * m= f.NhanSoThuc(4);
 * n=g.NhanSoThuc(-2);
 * System.out.println("4f(x)-2g(x)= "+DaThuc.CongDaThuc(m,n));
 * //Giai PT f(x)=0
 * String[] kq=f.GiaiPhuongTrinh();
 * for (int i=0;i<kq.length;i++)
 * System.out.println(kq[i]);
 * //Giai PT g(x)=0
 * kq=g.GiaiPhuongTrinh();
 * for (int i=0;i<kq.length;i++)
 * System.out.println(kq[i]);
 * //Tim giao diem cua y=3 va y=x
 * kq=(DaThuc.CongDaThuc(new DaThuc(0,0,3),(new
 * DaThuc(0,1,0).NhanSoThuc(-1)))).GiaiPhuongTrinh();
 * for (int i=0;i<kq.length;i++)
 * System.out.println(kq[i]);
 * //Duong thang y=2x+3 cat f(x) tai dau?
 * DaThuc y= new DaThuc(0,2,3);
 * kq=(DaThuc.CongDaThuc(f,y.NhanSoThuc(-1))).GiaiPhuongTrinh();
 * for (int i=0;i<kq.length;i++)
 * System.out.println(kq[i]);
 * //Doc va giai PTB2 trong tap tin
 * File file = new File("D:\\PTB2.txt");
 * try
 * {
 * BufferedReader br = new BufferedReader(new FileReader(file));
 * String st;
 * while ((st = br.readLine()) != null)
 * {
 * String[] tokens = st.split(",");
 * DaThuc k= new
 * DaThuc(Double.valueOf(tokens[0]),Double.valueOf(tokens[1]),Double.valueOf(
 * tokens[2]));
 * String[] res=k.GiaiPhuongTrinh();
 * System.out.println("Giai PT "+k+" = 0");
 * for (int i=0;i<res.length;i++) System.out.println(res[i]+"  ");
 * System.out.println();
 * }
 * }
 * catch (Exception e) {}
 * 
 */