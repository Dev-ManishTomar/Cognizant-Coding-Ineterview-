
public class decimal_to_binary {
public static void main(String[] args) {
	int num=439;
	int rem[]=new int[50];
	int i=0;
	
	while(num>0){
	 rem[i]=num%2;
		num=num/2;
		i++;
		
	}
	System.out.println(i);
	for(int j=i-1;j>=0;j--)   // i-1 is important to print no. in reverse order
	System.out.print(rem[j]);
}
}
