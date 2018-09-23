/*  000000
	010000
	002000
	000300
	000040
	000005
 */
public class pattern9 {
public static void main(String[] args) {
	for(int i=0;i<6;i++){
		for(int j=0;j<6;j++){
			if(i==j)
				System.out.print(j);
			else
				System.out.print("0");
				
		}
		System.out.println();
	}
}
}
