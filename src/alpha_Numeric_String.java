// Remove Numbers from Alphanumeric string
public class alpha_Numeric_String {
	public static void main(String[] args) {
		String str="hello123";
		System.out.println(str);	
		str=str.replaceAll("[1-9]", " "); // Regex "[a-zA-Z0-9]" whatever u want to replace
		System.out.println(str);
	}
}
