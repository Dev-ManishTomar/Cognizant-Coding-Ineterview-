
public class Triplet_sum {
public static void main(String[] args) {
	int array[]={5,1,6,7,9,3,4};
	int sum=16;
	int result = 0;
	
	System.out.println("NO.whose sum = 16 :");
	for(int i=0;i<=array.length-1;i++){
		for(int j=i+1;j<=array.length-1;j++){
			for(int k=j+1;k<=array.length-1;k++){
				
				 result=array[i]+array[j]+array[k];
				 if(result==sum)
						System.out.println("Triplet is " + array[i] + " ," + array[j]  + " ," + array[k]);
				
			
			}
		}
	}
	
}
}
