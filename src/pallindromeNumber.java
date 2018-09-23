
public class pallindromeNumber {
	public static void main(String[] args) {
		int n=151,r;
		int s=0;
	int t=n;
		
		while(n>0){
			r=n%10;
			n=n/10;
			s=s*10+r;
			
		}
		if(t==s){
			System.out.println("P.N");
		}
		else 
			System.out.println("N.P.N");
	}

}
