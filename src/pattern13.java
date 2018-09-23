/*
 1 1 1 2
 3 2 2 2 
 3 3 3 4
 */
public class pattern13 {
public static void main(String[] args) {
	for(int i=1;i<=3;i++){
		if(i%2!=0){     // odd
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i+1);
			
			System.out.println();
		}
		else{
			System.out.print(i+1);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			
			System.out.println();
			
		}
	}
	
}}
