/*
    3
	44
	555
	6666
	555
	44
	3
 */
public class pattern14 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++)              // FIRST HALF
			System.out.print(i+2);
			System.out.println();
	}
	
		for( int i = 3;i>=1;i--) {								//i=n-1 since n=4 
			for(int k=1;k<=i;k++){                             //SECOND HALF
				System.out.print(i+2);
			}
			System.out.println();	
		}
		
	
}
}
