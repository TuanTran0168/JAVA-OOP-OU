package linhTinh.OnThi.DeCS2022.Cau3;

class Em implements IEm {
	private String id;
	private String name;
	public static int count = 0;
	{
		this.id = String.format("SV2022-%03d", ++count);
	}

	public Em(String name) {
		this.name = name;
	}
	
	public void output() {
		System.out.println("id: " + this.id);
		System.out.println("Name: " + this.name);
	}

	public String getSortField() {
		return this.id;
	}
}