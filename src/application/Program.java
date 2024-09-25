package application;

import java.time.LocalDate;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Books");
		System.out.println(dp);
	
		Seller seller = new Seller(1, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, dp);
		System.out.println(seller);
	}

}
