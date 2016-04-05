import java.text.DecimalFormat;

public class Circle {
	private double radius;
	private double circumference;
	private double area;
	private double pi = Math.PI;
	private static int count = 0;

	public Circle(double radius) {
		this.radius = radius;
		count++;
	}

	public double getCircumference() {
		circumference = pi * radius * 2;
		return circumference;
	}

	public double getArea() {
		area = pi * radius * radius;
		return area;
	}

	public String getFormattedCircumference() {
		return formatNumber(circumference);
	}

	public String getFormattedArea() {
		return formatNumber(area);
	}

	private String formatNumber(double x) {
		DecimalFormat format = new DecimalFormat("#.##");
		String formattedNumber = format.format(x);
		return formattedNumber;
	}

	public static int getObjectCount() {
		return count;
	}

}
