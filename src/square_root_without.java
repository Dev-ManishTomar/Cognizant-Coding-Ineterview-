
public class square_root_without {

	public static void main(String[] args) {
		System.out.println(sqrt(47));
	}

	public static double sqrt(int number) {
		double r;
		double squareRoot = number;
		
	 
		do {
			r = squareRoot;
			squareRoot = (r + (number / r)) / 2;
		} 
		while ((r - squareRoot) != 0);
	 
		return squareRoot;
	}
	}
