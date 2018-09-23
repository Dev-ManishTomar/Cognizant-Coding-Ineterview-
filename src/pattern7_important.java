/*  1  
	1 1       // when i==j or j==0/1 -> array[i][j]=1
	1 2 1 
	1 3 3 1 
	1 4 6 4 1 
	1 5 10 10 5 1 */
 
// PascaL Traingle
public class pattern7_important {
	public static void main(String[] args) {
		int array[][]=new int [7][7];
		
		for(int i=1;i<=6;i++){
			 // for spaces it is optional
			for(int k=1;k<=6-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				
				if(i==j||j==1)  	      // First and last values in every row are 1 
					array[i][j]=1;
				else
					array[i][j]=array[i-1][j-1]+array[i-1][j];
				 System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
