package test;

public class MainTest {

	public MainTest() {
	}

	public String calc(float a, float b, float c) {
		if (a == 0) {
			return "Syntax error.";
		} else {
			float delta = b * b - 4 * a * c;
			if (delta < 0) {
				return "Not have result.";
			} else {
				if (delta == 0) {
					return "a = b = "
							+ String.valueOf((-b - sqrt((double) delta))
									/ (2 * a));
				} else {
					return "a = "
							+ String.valueOf((-b - sqrt((double) delta))
									/ (2 * a))
							+ '\n'
							+ "b = "
							+ String.valueOf((-b + sqrt((double) delta))
									/ (2 * a));
				}
			}
		}
	}

	private float sqrt(double delta) {
		return (float) java.lang.Math.sqrt(delta);
	}

	public static void main() {
		MainTest m = new MainTest();
		System.out.print(m.calc(2, 3, 1));
	}

}
