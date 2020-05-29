package com.sapient.employee;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	private final List<EmployeePOJO> list = new ArrayList<>();
    void addEmployee(EmployeePOJO e){
        list.add(e);
    }

    EmployeePOJO getEmployee(int id) {
    	for(EmployeePOJO e:list) {
    		if(id==e.getId()) {
    			return e;
    		}
    	}
		return null;
    }

}
