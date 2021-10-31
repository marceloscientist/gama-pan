package entradas;

import java.util.Scanner;

public class LerScanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username: ");

		String userName = myObj.nextLine();
		int userAge = myObj.nextInt();
		String userCity = myObj.nextLine();
		
		System.out.println("Username is: "+ userName);
		System.out.println("Userage is: "+ userAge);
		System.out.println("Usercity is: "+ userCity);

		
		myObj.close();
	}

}
