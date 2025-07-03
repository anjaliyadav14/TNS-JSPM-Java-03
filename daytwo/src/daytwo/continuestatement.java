package daytwo;

public class continuestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
		    if (i % 2 == 0) {
		        continue; // Skip even numbers
		    }
		    System.out.println(i);
		}

	}

}
