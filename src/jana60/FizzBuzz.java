package jana60;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		
		while(flag==false) {
			System.out.print("inserisci un un numero da 1 a 200:");
			int num = scan.nextInt();
		
		
			
	
		if (num >= 1 && num <= 200) {
			flag = true;
			
		for (int i=1; i <= num; i++) {
			if (i %3 ==0 && i % 5 ==0) {
				System.out.println("FITZ BUTZ");
			}
			if (i %3 == 0) {
				System.out.println("FITZ");
			
			}
			else if (i %5 == 0) {
				System.out.println("BUTZ");
			}
			else {
				System.out.println(i);
			}
			scan.close();
		}

	}
}
}
}
