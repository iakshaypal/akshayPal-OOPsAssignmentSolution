package com.driver;

import com.admin_department.AdminDepartment;
import com.hr_department.HrDepartment;
import com.tech_department.TechDepartment;

public class Main {
	public static void main(String[] args) {

		// Creating objects of HrDepartment,AdminDepartment and TechDepartment.
		HrDepartment hr = new HrDepartment();
		AdminDepartment admin = new AdminDepartment();
		TechDepartment tech = new TechDepartment();

		// Invoking the methods of HrDepartment
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();

		// Invoking the methods of AdminDepartment
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();

		// Invoking the methods of TechDepartment
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
	}

}
