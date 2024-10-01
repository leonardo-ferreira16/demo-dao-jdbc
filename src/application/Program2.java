package application;

//import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dp = departmentDao.findById(1);
		System.out.println(dp);
		
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> dps = departmentDao.findAll();
		for(Department d : dps) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: department update ===");
		dp = departmentDao.findById(1);
		dp.setName("Food");
		departmentDao.update(dp);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.println("Enter id for delete test: ");
		int id = scanner.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		scanner.close();
		
	}

}
