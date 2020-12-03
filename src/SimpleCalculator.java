package cmm_cis350;

import java.lang.Math; 

public class SimpleCalculator {
	

	public static final void main(String[] args) {
		
	}

	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int div(int a, int b) {
		return a / b;
	}

	public int power(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	public int mod(int a, int b) {
		return a % b;
	}
}
