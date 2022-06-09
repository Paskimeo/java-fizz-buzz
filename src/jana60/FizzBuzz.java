package jana60;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i=1; i <= 100; i++) {
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
		}

	}
}


