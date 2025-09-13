package com.controller;

import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		EmployeeService ss = new EmployeeService();
		ss.insertData();
		ss.updateData();
		ss.deleteData();
		ss.getSingleRecord();
		ss.getAllRecord();

}
}