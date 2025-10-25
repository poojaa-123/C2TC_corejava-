//Program to demonstrate nested Try Catch Block
package DAY11.v1;

public class NestedTryBlockEx {
	public static int divide(int x, int y) {
		int z = 0;
		z = x / y;
		System.out.println("Result of division is z: " + z);
		return z;
	}

	public static void main(String[] args) {
		try {
			try {
			} catch (ArithmeticException ae) {
				System.err.println("Error! A number cannot be divided by 0");
			}
		} catch (NumberFormatException e) {
			System.err.println("Error! Invalid input, number must be an integer.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error! please pass numbers ");
		}
		System.out.println("I am out of outer catch block");
	}
}