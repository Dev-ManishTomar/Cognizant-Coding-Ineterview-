/*
    1
	1	1	
	1	1	2	
	1	1	2	3	
	1	1	2	3	5
 */
public class pattern10 {
public static void main(String[] args) {
	int array[]=new int[20];
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			if(j==1||j==2){
				
		array[j]=1;
		
		System.out.print(array[j]+" ");
		
		}
			else
			{
				array[j]=array[j-1]+array[j-2];
				System.out.print(array[j]+" ");
			}
			
		
	}
		System.out.println();
		}}}


