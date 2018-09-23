// print 1-10 without loops
// GOOD EX OF RECURSIVE FUNCTION
public class one_ten_without_loops {
public static void main(String[] args) {
	printNumber(1);// passing 1 into function which gets increment and printed until condition follows
	
}
static void printNumber(int num){ 
	if(num<=10){
		System.out.println(num);
		num++;
		printNumber(num);
		
	}
}
}
