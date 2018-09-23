import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int counter=0;
		System.out.println("Enter the Number");
		Scanner input=new Scanner(System.in);
				int n = input.nextInt();
				System.out.println("The Number is: "+n+ " and it is:");
				
				for(int i=1;i<=n;i++){
					if(n%i==0)
						counter++;
					
				}
				if(counter==2)
					System.out.println("prime Number");
				else
					System.out.println("Not A Prime Number");
	}

}
