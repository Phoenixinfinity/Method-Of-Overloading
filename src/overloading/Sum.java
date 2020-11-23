package overloading;

public class Sum {
	public int sum(int a, int b)
	{
		return (a+b);
	}
	public float sum(float a, float b,float c)
	{
		return (a+b+c);
	}
	public float sub(float a, float b )
	{
		return(a-b);
	}
    
	public static void main(String[] args) {
		Sum obj = new Sum();
		System.out.println("(Int) Addition is:- "+obj.sum(12, 5));
		System.out.println("(Float)Addition is: "+obj.sum(12, 1, 1));
		System.out.println("Subtarction is: "+obj.sub(15, 2));
	}

}
