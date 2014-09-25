package test;

class exceptions extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final String error = "Loi chia cho 0";

	public exceptions() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return error;
	}
}

public class Triangle {
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public String whatIsTriangle(double a, double b, double c) {
		String result = "triangle";
		if (a + b <= c || b + c <= a || c + a <= b || a <= 0 || b <= 0
				|| c <= 0) {
			result = "not a triangle";
			return result;
		}
		if (a == b && b == c) {
			result = "equilateral triangle";
			return result;
		}
		if (a == b || b == c || c == a) {
			System.err.println(Math.round((float)a * a*100000.0)/100000.0 + " |||| " + Math.round((float)(b * b + c * c)*100000.0)/100000.0);
			if (Math.round((float)a * a*100000.0)/100000.0 == Math.round((float)(b * b + c * c)*100000.0)/100000.0
					|| Math.round((float)b * b*100000.0)/100000.0 == Math.round((float)(c * c + a * a)*100000.0)/100000.0
					|| Math.round((float)c * c*100000.0)/100000.0 == Math.round((float)(a * a + b * b)*100000.0)/100000.0) {
				result = "balance right triangle";
			} else {
				result = "balance triangle";
			}
			return result;
		}
		if (a * a == b * b + c * c || b * b == c * c + a * a
				|| c * c == a * a + b * b) {
			result = "right triangle";
			return result;
		}
		return result;
	}
}
