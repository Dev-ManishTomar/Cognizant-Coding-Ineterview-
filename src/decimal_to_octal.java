
public class decimal_to_octal {public static void main(String[] args) {
	int num=19;
	int rem[]=new int[50];
	int i=0;
	
	while(num>0){
	 rem[i]=num%8;
		num=num/8;
		i++;    // i is increasing every time [i= no of digit in octal number]
	}
	for(int j=i-1;j>=0;j--)   // i-1 is important to print no. in reverse order
	System.out.print(rem[j]);

}}
