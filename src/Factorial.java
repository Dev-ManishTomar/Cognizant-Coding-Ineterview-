import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner input=new Scanner(System.in);
				int n = input.nextInt();
				System.out.println("The Number is: "+n+ " and it's Factorial is :");
				int f=1;
				for(int i=1;i<=n;i++)
				{
					f=f*i;
				}
				System.out.println(+f);
				
	}

}
