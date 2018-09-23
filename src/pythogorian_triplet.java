public class pythogorian_triplet {
public static void main(String[] args) {

	int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	

	for(int i=0;i<=array.length-1;i++){
		for(int j=i+1;j<=array.length-1;j++){
			for(int k=j+1;k<=array.length-1;k++){
				int x=array[i]*array[i];
				int y=array[j]*array[j];
				int z=array[k]*array[k];
				if(x==y+z||y==x+z||z==x+y){
					System.out.println(+array[i]+" "+array[j]+" "+array[k]+" ");
				}
			}
		}
	}
}
}
