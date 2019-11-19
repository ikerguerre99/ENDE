package menuakGit;

import java.util.Scanner;

public class menuak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aukera;
		
		System.out.println("----MENUA----\n"
				+ "0- gehiketa\n"
				+ "1- kenketa\n"
				+ "3- biderketa\n"
				+ "4- zatiketa\n");
		
		aukera = Integer.parseInt(scan.nextLine());
		
		switch (aukera) {
		case 1:
			System.out.println("Gehiketa aukeratu duzu");
			break;
		case 2:
			System.out.println("Kenketa aukeratu duzu");
			break;
		case 3:
			System.out.println("Biderketa aukeratu duzu");
			break;
		case 4:
			System.out.println("Zatiketa aukeratu duzu");
			break;
		
	}

	}
}
