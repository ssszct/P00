
public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	
	public int subtract(int a,int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public int expo(int a, int b) {
		int result = a;
		for(int i = 1 ;i<b;i++ ) {
			result = result * a;
		}
		return result;
	}
}
