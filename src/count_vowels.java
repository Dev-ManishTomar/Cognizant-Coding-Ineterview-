
public class count_vowels {
	public static void main(String[] args) {
		int counter=0;
		String str="abc def hij klm nop qas tuv";
		char array[]=str.toCharArray();
		
		
		
		for(int i=0;i<=array.length-1;i++){
			if(array[i]=='a'||array[i]=='e'||array[i]=='i'||array[i]=='o'||array[i]=='u')
				counter++;
		}
		System.out.println(+counter);
	}

}
