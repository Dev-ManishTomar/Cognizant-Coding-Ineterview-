/*  1 
	2 2 
	3 3 3 
	4 4 4 4 
	5 5 5 5 5 
	6 6 6 6 6 6 */

public class pattern4 {
	public static void main(String[] args) {
		int counter =1;
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print(counter+" ");
				
			}
			counter++;
			System.out.println();
		}
	}

}