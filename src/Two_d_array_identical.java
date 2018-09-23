
public class Two_d_array_identical {
	static final int N = 3;
public static void main(String[] args) {
	
	int A[][]={{1,2,3},{4,5,6},{7,8,9}};
	int B[][]={{1,2,3},{4,5,6},{7,8,9}};
	 if (areSame(A, B) == 1)
         System.out.print("Matrices are identical");
     else
         System.out.print("Matrices are not identical");
 }

private static int areSame(int A[][] , int B[][]) {
	
	
	 int i, j;
     for (i = 0; i < N; i++)
         for (j = 0; j < N; j++)
             if (A[i][j] != B[i][j])
                 return 0;
         return 1;
}
	
	
	
	
}

