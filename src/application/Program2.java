
package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department seller = departmentDao.findById(1);
		
		System.out.println(seller);

		System.out.println("\n=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
	
		System.out.println("\n=== TEST 3: Department insert ===");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		/*
		System.out.println("\n=== TEST 5: seller update ===");
		seller = departmentDao.findById(1);
		seller.setName("Martha Waine");
		departmentDao.update(seller);
		System.out.println("update Complete!");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delet test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		*/
		sc.close();
	}

}
