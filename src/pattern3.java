// Triangele
public class pattern3 {
public static void main(String[] args) {
	for (int i=0;i<=6;i++){
		for(int j=1;j<=6-i;j++){
			System.out.print(" ");// we r printing spaces which creates a pattern itself
		}
		for(int k=0;k<=2*i;k++){
			System.out.print("*");// simply printing stars as 1,3,5,7,9
		}
		System.out.println();
	}
	
}
}
