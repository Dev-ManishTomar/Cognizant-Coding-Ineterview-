// count no. of occurence of alphabet in a string
import java.util.Collections;
import java.util.LinkedHashMap;

public class alphabet_count {
public static void main(String[] args) {
	String str="geeksforgeeks";
	int n=str.length();
	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	 for(int i=0;i<n;i++){
	 char c=str.charAt(i);
	 
	
	 
	 if(map.containsKey(c)){
		 map.put(c, map.get(c)+1);
	 }
	 else{
		 map.put(c, 1); 
	 }
	
	 
}
System.out.println(map);
for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {  // Itrate through hashmap
    Integer maxValueInMap = (Collections.max(map.values()));
	if (entry.getValue()==maxValueInMap) {
        System.out.println(entry.getKey());     // Print the key with max value
    }
}



}}
	