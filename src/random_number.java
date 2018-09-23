import java.util.Random;

public class random_number {
public static void main(String[] args) {
	Random input =new Random();
	System.out.println("10 Random Number Between 1 to 1000");
	
	for(int i=1;i<=10;i++){
		System.out.println(input.nextInt(1000));	
	}
		
	
	}
}



