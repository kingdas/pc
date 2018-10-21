package free;

//overload method
class overload {
	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	public static int add(int a, double b) {
		return 1;
	}

	public static double add(double a, int b) {
		return 1.0;
	}

	public static int add(int... a) {
		int s = 1;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		return s;
	}
	public static int add(int a) {
		return 9;
	}
}

public class Free3 {
	public static void main(String[] args) {
		System.out.println(overload.add(3,2));
		System.out.println(overload.add(1.2,2.3));
		System.out.println(overload.add(1,2));
	}
}
