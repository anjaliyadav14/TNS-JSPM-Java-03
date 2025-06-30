package daytwo;

public class Nestedforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		for(int i=1; i<=num; i++) {
			if(i % 2 == 0) {
				continue;
			}
			else {
				System.out.println(i +" is odd");
			}
		}
			
	

}
}