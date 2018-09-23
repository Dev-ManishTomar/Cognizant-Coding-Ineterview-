
public class gcd {
public static void main(String[] args) {
	
	int a=10,b=20;
	System.out.println(gcd(a,b));
	
	
}
static int gcd(int a,int b){
	if(a==0){
		return b; // will be our gcd when a=0
	}
	else return gcd(b%a,a);
}

}