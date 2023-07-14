class CirclesWithException {
	private double radius;

	public CirclesWithException(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius < 0) {
			throw new IllegalArgumentException("The argument radius is negative.");
		}


		this.radius = radius;
	}


	public void printRadius() {
		System.out.println("Radius: " + radius);
	}


}


public class App {

	public static void main(String[] args) {
		// CirclesWithException with positive, negative and zero
		try {
			CirclesWithException positive = new CirclesWithException(5);
			positive.printRadius();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			CirclesWithException negative = new CirclesWithException(-5);
			negative.printRadius();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			CirclesWithException zero = new CirclesWithException(0);
			zero.printRadius();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}


	}
}