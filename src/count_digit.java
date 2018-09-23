// count digit in a Number;

public class count_digit {
	public static void main(String[] args) {
		int number=45957492;
		int counter=0;
		
		while(number>0){
			number=number/10;
			counter++;
		}
		System.out.println(+counter);
		
	}

}
