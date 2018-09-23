import java.util.Scanner;

public class fibonacciSeries {
public static void main(String[] args) {
	int first=0;
	int second=1;
	int next,num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	num=sc.nextInt();
	System.out.println(+first +"\n"+second);
	for(int i=2;i<num;i++){ // the lopp stars from 2 beacuse 2 entries are alteady filled
	next=first+second;
	first=second;
	second=next;
	System.out.println(+next);
	}
	
	
}
}
