package linhTinh.OnThi.DeCS2022.Cau3;

import java.util.ArrayList;
import java.util.List;

class EmployeeManager {
	private List<IEm> em = new ArrayList<>();

	public void addEmployee(IEm e) {
		this.em.add(e);
	}

	public void output() {
		this.em.forEach(e -> e.output());
	}

    // public List <IEm> sort() {
    //     return this.em.sort((e1, e2) -> {
    //         e1.getSortField().compareTo(e2.getSortField());
    //     });
    // }

    public int soSanh(IEm e1, IEm e2) {
        return e1.getSortField().compareTo(e2.getSortField());
    }
	
	public void sort() {
		this.em.sort((e1, e2) -> {
            return -soSanh(e1, e2);
        });
	}

	// public List<IEm> sort1() {
	// 	return this.em.sort((e1, e2)-> {
	// 		-(e1.id - e2.id)
	// 	});
	// }

	// public void sort2() {
	// 	for(e : em) {
			
	// 	}
	// }
}
