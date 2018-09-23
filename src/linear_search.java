import java.util.Scanner;

public class linear_search {
public static void main(String[] args) {
	int i;
	int array[]={1,2,3,4,5,6,8,9,5};
	System.out.println("enter the number to search");
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	for( i=0;i<array.length-1;i++){
		if(num==array[i]){
			System.out.println("present");
			break;
		}}
			if( i==num)
			System.out.println("NO");
		
	}
	
	
	
}

