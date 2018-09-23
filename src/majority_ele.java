
public class majority_ele {
public static void main(String[] args) {
	 int arr[] = {2, 6, 6, 6, 3, 5, 6};
	 int n=arr.length;
	 findMajority(arr,n);
}

static void findMajority(int arr[], int n){
	int max_count=0;
	int index=-1;
	
	for(int i=0;i<n;i++){
		int count=0;
		for(int j=0;j<n;j++){
			if(arr[i]==arr[j]){
				count++;
			}
		}
		if(count>max_count){
			max_count=count;
			index=i;   //first occurence of majority element
		}
	}
	if(max_count>n/2){
		System.out.println("Majority Element :"+arr[index]);
	}
	else{
		System.out.println("NO Majority Element");
	}
}
}
