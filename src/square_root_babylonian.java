
public class square_root_babylonian {
public static void main(String[] args) {
	int n = 55;
    
    System.out.printf ("Square root of "
            + n + " is " + squareRoot(n));
}

static float squareRoot(float n)
{
     
    /*We are using n itself as 
    initial approximation This 
    can definitely be improved */
    float x = n;
    float y = 1;
     
    // e decides the accuracy level
    double e = 0.0001;
    while(x - y > e)
    {
        x = (x + y)/2;
        y = n/x;
    }
    return x;
}
 
}
