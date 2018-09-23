
public class SumOfFactorials {
	public static void main(String[] args) {
		int sum=0;
		int fact = 1,n = 4;
		for(int i=n;i>=1;i--){
			for(int j=n;j>=1;j--){
				fact=fact*j;
			}
			sum=sum+fact;
			fact=1;
		}
		System.out.println(sum);
	}

}
