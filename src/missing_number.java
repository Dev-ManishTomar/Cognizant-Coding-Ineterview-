// Get the sum of numbers 
 //      total = n*(n+1)/2
    		   
//Subtract all the numbers from sum and
  //  		   you will get the missing number
    		   


public class missing_number {
public static void main(String[] args) {
	int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,15}; // Numbers are in ordered form
	int n=array.length;
	int sum=(n+1)*(n+2)/2; //Remember (n+1)
	for(int i=0;i<=array.length-1;i++){
		sum=sum-array[i];
	}
	System.out.println(sum);
}
}
