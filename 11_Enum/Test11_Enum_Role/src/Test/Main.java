package Test;

import java.util.Scanner;

/*Viết chương trình mô phỏng một hệ thống phân quyền truy cập 
 * bằng cách sử dụng enum. Các vai trò sẽ được định nghĩa bằng 
 * enum và mỗi vai trò sẽ có quyền truy cập khác nhau vào các 
 * tài nguyên khác nhau.*/
public class Main {
	public static void main(String[] args) {
		AccessControl ac = new AccessControl();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter user role (admin, manager, or staff):");
			String roleName = scanner.nextLine();

			Role role;
			try {
				role = Role.valueOf(roleName.toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid role.");
				continue;
			}

			System.out.println("Enter resource name (customer, product, or order):");
			String resourceName = scanner.nextLine();

			Resource resource;
			try {
				resource = Resource.valueOf(resourceName.toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid resource.");
				continue;
			}

			if (ac.hasAccess(role, resource)) {
				System.out.println("Access granted.");
			} else {
				System.out.println("Access denied.");
			}
		}
	}
}
