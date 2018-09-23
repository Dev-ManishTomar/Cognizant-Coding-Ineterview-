import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner input=new Scanner(System.in);
				int n = input.nextInt();
				System.out.println("The Number is:"+n+"and it's");
				if(n%2==0)
					System.out.println("even");
				else
					System.out.println("odd");
				
		
	}

}
