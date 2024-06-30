package com.infinity.collections5;

import java.util.Comparator;

public class EmployeeSalarySorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpSal() > o2.getEmpSal()) {
            return 1;
		}else {
			return -1;
		}
	}

}
