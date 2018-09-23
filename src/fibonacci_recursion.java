import java.util.Scanner;
import java.util.Scanner;
public class fibonacci_recursion {
	public static void main(String[] args) {
		System.out.println("Enter the no up to which:");
		Scanner in =new Scanner(System.in);
		int b=in.nextInt();
		for(int i=0;i<=b;i++){
		
		System.out.println(fib(i));
		}
		
	}
static int fib(int n){
	      if(n<=1){
			return 1;
			}
		else
			return fib(n-1)+fib(n-2);
	
		
	
} 
}
