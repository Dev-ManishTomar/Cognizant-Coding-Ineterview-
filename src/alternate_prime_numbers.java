import java.util.Scanner;

public class alternate_prime_numbers {
	public static void main(String[] args) {
		int counter=0;
		int array[]=new int[100];
		System.out.println("Enter The Range:");
		Scanner input=new Scanner(System.in);
				int a = input.nextInt();
				int b = input.nextInt();
				for(int i=a;i<=b;i++){
			     if (isprime(i)) {  
			               System.out.println(i+=2);  
					
	}

	
}}
public static boolean isprime(int n){
	int counter=0;
	for(int i=1;i<=n;i++){
		if(n%i==0)
			counter++;
		
	}
	if(counter==2)
    return true;  
	else
		return false;
}

}
