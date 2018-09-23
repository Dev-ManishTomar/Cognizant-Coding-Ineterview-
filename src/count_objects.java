
public class count_objects {
public static void main(String[] args) {
	// created 5 object
	A obj1=new A();
	A obj2=new A();
	A obj3=new A();
	A obj4=new A();
	A obj5=new A();
	obj5.count_obj();   // call the function using object reference 
}
}
 class A{
	static int i=0; // must be static so it can be shared 
	 A(){            // counstructor A
		i++;         // everytime a contructor is called by an object ....i++
	}
	static void count_obj(){
		System.out.println(i);
	}
}
