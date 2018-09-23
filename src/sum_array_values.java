
public class sum_array_values {
public static void main(String[] args) {
	int array[]={1,2,3,4,5,6,7,8,9,5};
	int s=0;
	for(int i=0;i<=array.length-1;i++){
		s=s+array[i];
	}
	System.out.println(+s);
}
}
