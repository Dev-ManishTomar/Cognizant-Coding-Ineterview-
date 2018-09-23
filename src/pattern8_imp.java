/* 1
   3 2
   4 5 6
   10 9 8 7
   11 12 13 14 15
 */

// Amcat Mindtree zig zag format

public class pattern8_imp{
public static void main(String[] args) {
	
	int p=1;
	int	k=1;
	
	for(int i=1;i<=5;i++){
		if(i==1)
			System.out.print("1");
		
		else if(i%2==0){
		
			int counter1=(i*k)+k;
			for(int c=1;c<=i;c++)
				System.out.print(counter1-- +" ");
			k++;
		}
		else
		{
			
			int counter2=(i*p)+1;
			for(int j=1;j<=i;j++)
			System.out.print(counter2++ +" ");
			p++;
		}
		System.out.println();
		
		
		
		
	}	
}
}