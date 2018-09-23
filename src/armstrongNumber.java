
public class armstrongNumber {
public static void main(String[] args) {
	int n=371,r;
	int s=0;
    int t=n;
	
	while(n>0){
		r=n%10;
		n=n/10;
		s=s+(r*r*r);
		
	}
	if(t==s){
		System.out.println("A.N");
	}
	else 
		System.out.println("N.A.N");
}
}

