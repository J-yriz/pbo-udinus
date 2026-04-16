package complex;

public class Main {
	public static void main(String[] args) {
		Complex n1 = new Complex(2.3, 4.5);
		Complex n2 = new Complex(3.4, 5.0);
		Complex temp = Complex.add(n1, n2);

		System.out.printf("Sum = %.1f + %.1fi%n", temp.real, temp.imag);
	}
}
