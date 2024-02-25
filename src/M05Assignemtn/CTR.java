package M05Assignemtn;

abstract class Abstract {
	abstract void Circle(int x);
	abstract void Triangle(int x, int f);
	abstract void Rec(int x, int f);
	}
	
	public class CTR extends Abstract{
	void Circle(int x) {
		double Area = x * x * Math.PI;
		System.out.println("Our Circle area is: " + Area);
	}
	void Triangle(int Base, int Height) {
		double Area = (Base * Height) / 2;
		System.out.println("Our Triangle Area is: " + Area);
	}
	void Rec(int length, int width) {
		double Area = length*width;
		System.out.println("Our Are of Rectangle Is: " + Area);
	}
	
	
	


	public static void main(String[] args) {
		int InNumber = 6;
		int ExampleIn = 4;
		
		Abstract Obj = new CTR();
		Obj.Circle(InNumber);
		Obj.Triangle(InNumber, ExampleIn);
		Obj.Rec(ExampleIn, InNumber);
	}

}
