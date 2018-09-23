/*
    A
	AP
	APP
	APPL
	APPLE
	APPL
	APP
	AP
	A
 */
public class pattern12_imp {

	public static void main(String[] args) {
		String str="APPLE";
		int n=9;
		
		for(int i=1;i<=n;i++){
			if(i<=5){
				for(int j=0;j<=i-1;j++)
				{
					System.out.print(str.charAt(j));
				}
			}
			
			else
			{
				for(int j=0;j<=n-i;j++)
				{
					System.out.print(str.charAt(j));
			     
				}
				
			
		}
			System.out.println();
	}
}}
