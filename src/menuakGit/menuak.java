package menuakGit;

import java.util.Scanner;

public class menuak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aukera;
		
		System.out.println("----MENUA----\n"
				+ "0- gehiketa\n"
				+ "1- kenketa\n"
				+ "2- biderketa\n"
				+ "3- faktorial\n"
				+ "4- zatiketa");
		
		aukera = Integer.parseInt(scan.nextLine());
		
		switch (aukera) {
		case 0:
			System.out.println("Gehiketa aukeratu duzu");
			
			int batuketaBat;
			int batuketaBi;
			System.out.println("Sar ezazu zenbaki bat");
			batuketaBat = scan.nextInt();
			
			System.out.println("Sar ezazu beste bat");
			batuketaBi= scan.nextInt();
			
			int batuketa = batuketaBat + batuketaBi;
			System.out.println(batuketa);
			break;
		case 1:
			System.out.println("Kenketa aukeratu duzu");
			
			int kenketaBat;
			int kenketaBi;
			System.out.println("Sar ezazu zenbaki bat");
			kenketaBat = scan.nextInt();
			
			System.out.println("Sar ezazu beste bat");
			kenketaBi= scan.nextInt();
			
			int kenketa = kenketaBat - kenketaBi;
			System.out.println(kenketa);
			break;
		case 2:
			System.out.println("Biderketa aukeratu duzu");
			
			int biderketaBat;
			int biderketaBi;
			System.out.println("Sar ezazu zenbaki bat");
			biderketaBat = scan.nextInt();
			
			System.out.println("Sar ezazu beste bat");
			biderketaBi= scan.nextInt();
			
			int biderketa = biderketaBat + biderketaBi;
			System.out.println(biderketa);
			break;
		case 3:
			System.out.println("Faktoriala aukeratu duzu");
			
			int num;
		    int factorial = 1;
		    
		    System.out.println("Sar ezazu zenbaki bat: ");
		    num = scan.nextInt();
		    for (int i=2; i<=num; i++){
		        factorial = factorial * i;
		    }

		    System.out.println("Factorial: " + factorial);
			break;
		case 4: 
			System.out.println("Zatiketa aukeratu duzu");
			int zatiketaBat;
			int zatiketaBi;
			System.out.println("Sar ezazu zenbaki bat");
			zatiketaBat = scan.nextInt();
			
			System.out.println("Sar ezazu beste bat");
			zatiketaBi= scan.nextInt();
			
			int zatiketa = zatiketaBat + zatiketaBi;
			System.out.println(zatiketa);
			break;
		
	}

	}
}
