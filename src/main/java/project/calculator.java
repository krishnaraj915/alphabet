package project;

public class calculator {
	public int Add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
	calculator cal = new calculator();
	int res = cal.Add(20,7);
	System.out.println(res);
	}
}
