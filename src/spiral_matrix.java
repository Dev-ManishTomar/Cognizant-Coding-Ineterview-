// NO. OF ROWS , NO. OF COLUMN INCREASE AND DECRESES AFTER EVERY ITERATION TO REDUCE MATRIX
public class spiral_matrix {
public static void main(String[] args) {
	 int R = 3;
     int C = 6;
     int a[][] = { {1,  2,  3,  4,  5,  6},
                   {7,  8,  9,  10, 11, 12},
                   {13, 14, 15, 16, 17, 18}
                 };
     spiralPrint(R,C,a);
}

static void spiralPrint(int m, int n, int a[][] ) {
	int k=0;
	int l=0;
	int i;
	while(k<m&&l<n){
		// Print the first row from the remaining rows
		for( i=l;i<n;i++){
			System.out.print(a[k][i]+" ");
		}
		k++; // INCREMENT THE ROW NO.
		
			// Print the last column from the remaining columns 
			for( i=k;i<m;i++){
				System.out.print(a[i][n-1]+" ");
			}
			n--; //DECREASE COLUMN NO.
			
			 // Print the last row from the remaining rows */
			if(k<m){
				for(i=n-1;i>=l;i--){
					System.out.print(a[m-1][i]+" ");
		          }
				m--;//DECREASE ROW NO.
				
				 // Print the first column from the remaining columns */
				if(l<n){
					for(i=m-1;i>=k;i--)
						System.out.print(a[i][l]+" ");	
					}
				l++;    //INCREMENT THE COLUMN NO.
			}
		
		
		
		
	}
	
}
}
