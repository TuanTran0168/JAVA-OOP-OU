package linhTinh.PhuMan;

public class NgayThang {
	private long D,M,Y;
	private char Format;
	NgayThang()
	{
		D=1;
		M=1;
		Y=1900;
		Format='E';
	}
	NgayThang(NgayThang n)
	{
		D=n.D;
		M=n.M;
		Y=n.Y;
		Format='E';
	}
	NgayThang(long ng,long th,long na)
	{
		Format='E';
		boolean Ngay=true,Thang=true,Nam=true;
		if(na<1900)// Xet k hop le
		{
			Y=1900;
			M=1;
			D=1;
			Nam=false;
		}
		if(th<1||th>12)
		{
			Y=1900;
			M=1;
			D=1;
			Thang=false;
		}
		if(ng<1||ng>31)
		{
			Y=1900;
			M=1;
			D=1;
			Ngay=false;
		}	
		else
		{
			int thTam=(int)th;
			switch (thTam)
			{
				case 4:case 6:case 9:case 11:
				{
					if(ng>30)
					{
						Y=1900;
						M=1;
						D=1;
						Ngay=false;
					}
						
					break;
				}
				case 2:
				{
					if((na % 4 == 0 && na % 100 != 0) || na % 400 == 0)
					{
						if(ng>29)
						{
							Y=1900;
							M=1;
							D=1;
							Ngay=false;
						}
							
					}
					else
					{
						if(ng>28)
						{
							Y=1900;
							M=1;
							D=1;
							Ngay=false;
						}
							
					}
							
				}
			}
		}// xet k hop le
		
		if(Ngay&&Thang&&Nam)
		{
			D=ng;
			M=th;
			Y=na;
		}
	}
	public void setFormat(char Ftam)
	{
		if(Ftam=='E'||Ftam=='V'||Ftam=='C')
			Format=Ftam;
		else
			Format='E';
	}
	public char getFormat()
	{
		return Format;
	}
	public String toString()
	{
		String ngay=String.valueOf(D);
		if(D<10)
		{
			ngay="0"+ngay;
		}
		String thang=String.valueOf(M);
		if(M<10)
		{
			thang="0"+thang;
		}
		String nam=String.valueOf(Y);
		if(Format=='C')
			return nam+thang+ngay;
		else if(Format=='V')
			return ngay+"-"+thang+"-"+nam;
		return thang+"/"+ngay+"/"+nam;
		
	}
	public boolean TimNgayThang(long NG,long TH)
	{
		if(D==NG&&TH==M)
			return true;
		return false;
	}
	public long SoNam(long namHienTai)
	{
		return namHienTai-Y;
	}
	public int SoSanh(NgayThang n)
	{
		if(D==n.D&&M==n.M&&Y==n.Y)
			return 0;
		if(Y<n.Y)
			return -1;
		if(M<n.M)
			return -1;
		if(D<n.D)
			return -1;
		return 1;
		
	}
}
