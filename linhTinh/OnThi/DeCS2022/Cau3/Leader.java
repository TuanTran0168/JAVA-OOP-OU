package linhTinh.OnThi.DeCS2022.Cau3;

class Leader extends Em {
	private String role;

	@Override
	public void output() {
		super.output();
		System.out.println("Role: " + this.role);
	}

	public Leader(String name, String role) {
		super(name);
		this.role = role;
	}
}
