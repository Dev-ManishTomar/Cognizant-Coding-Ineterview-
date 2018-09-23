import java.util.Scanner;

public class factiorial_recursion {
public static void main(String[] args) {
	System.out.println("enter the no");
	Scanner in =new Scanner(System.in);
	int b=in.nextInt();
	
	
	System.out.println(fact(b));
	
	
	
}
static int fact(int n){
	if(n==1){
		return 1;
	}
	else
		return n*fact(n-1);
}
}

