interface A{
	void sum(int a,int b);
}
interface B{
	void add(int x,int y);
}
class Sum implements A,B{
	public void sum(int a,int b) {
		System.out.println("SUM: "+(a+b));
	}
	public void add(int x,int y) {
		System.out.println("ADD: "+(x+y));
	}
}
public class Mul_in {
	public static void main(String[] args) {
		Sum obj  = new Sum();
		obj.sum(9, 8);
		obj.add(7, 5);
		
	}

}


