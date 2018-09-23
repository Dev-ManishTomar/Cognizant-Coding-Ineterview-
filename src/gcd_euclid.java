
public class gcd_euclid {
public static void main(String[] args) {
	int a=45,b=60;
	int c=70;
	
	// Euclidean algorithm
	// subtract smaller no from bigger no. until both are equal
	
//The idea is, GCD of two numbers doesn’t change if smaller number is subtracted from a bigger number.
	System.out.println(gcd(a,b)); // for two numbers
	System.out.println(gcd(c,(gcd(a, b)))); // for Three numbers
}

static int gcd(int a,int b){
	if(a==0||b==0){
		return 0;
	}
	if(a==b){
		return a;
	}
	if(a>b){
		return gcd(a-b, b); // passing values accordingly 
	}
	else
	return gcd(a, b-a); // passing values accordingly
	
}
}
