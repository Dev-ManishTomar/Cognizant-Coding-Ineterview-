import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class redundant_char_string {
public static void main(String[] args) {
	String str="abacddbeff";
	
	Set <Character> ch =new HashSet<>();
	for(int i=0;i<=str.length()-1;i++){
		ch.add(str.charAt(i));
	}
	
	for(Object i:ch){
		System.out.print(i);
	}
   
}
}
