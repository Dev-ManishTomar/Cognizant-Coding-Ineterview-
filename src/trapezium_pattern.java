/*1*2*3*4*17*18*19*20
    5*6*7*14*15*16
      8*9*12*13
        10*11
 */
//Trapezium Amcat
public class trapezium_pattern {
	public static void main(String[] args) {
		int n=4;
		int count1=0,count2=0;
		for(int i=n;i>=1;i--){
			
			for(int j=n;j>i;j--)
				System.out.print(" ");
			
				for(int k=1;k<=i;k++) System.out.print(++count1+"*");
				
				for(int l=1;l<=i;l++){ 
					System.out.print(++count2+i*i);   
	                                 if(l!=i) System.out.print("*");
				}
				
				System.out.println();
			}
		}
	}


